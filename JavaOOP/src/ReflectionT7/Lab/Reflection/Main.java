package ReflectionT7.Lab.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
//    private static class MethodComparator implements Comparator<Method> {
//
//        @Override
//        public int compare(Method f, Method s) {
//            boolean fistIsGetter = f.getName().startsWith("get");
//            boolean secondIsGetter = s.getName().startsWith("get");
//
//            if (fistIsGetter && secondIsGetter) {
//                return f.getName().compareTo(s.getName());
//            }
//            boolean fistIsSetter = f.getName().startsWith("get");
//            boolean secondIsSetter = s.getName().startsWith("get");
//            if (fistIsSetter && secondIsSetter) {
//                return f.getName().compareTo(s.getName());
//            }
//            return Boolean.compare(secondIsGetter, fistIsGetter);
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException {

        Class<Reflection> clazz = Reflection.class;

//        System.out.println(clazz);
//        System.out.println(clazz.getSuperclass());
//
//        try {
//            Arrays.stream(clazz.getInterfaces())
//                    .forEach(System.out::println);
//
//            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
//
//            Reflection ref = ctor.newInstance();
//            System.out.println(ref);
//
//        } catch (InvocationTargetException |InstantiationException |IllegalAccessException bx){
//            System.out.println(bx.getMessage());
//        }

//        Method[] declaredMethods = clazz.getDeclaredMethods();
//
//        Arrays.stream(declaredMethods)
//                .filter(m -> !m.getName().equals("toString"))
//                .sorted(new MethodComparator())
//                .forEach(Main::printMethodInfo);

        Arrays.stream(clazz.getDeclaredFields()).filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() != void.class)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .collect(Collectors.toList())
                .forEach(m -> System.out.println(m.getName() + " have to be public!"));

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() == void.class)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .collect(Collectors.toList())
                .forEach(m -> System.out.println(m.getName() + " have to be private!"));


    }

//    private static void printMethodInfo(Method method) {
//        String output = method.getName().startsWith("get")
//                ? String.format("%s will return class %s", method.getName(), method.getReturnType().getSimpleName())
//                : String.format("%s and will set field of class %s", method.getName(), method.getParameterTypes()[0].getSimpleName());
//        System.out.println(output);
//    }
}
