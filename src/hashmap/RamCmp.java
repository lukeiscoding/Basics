package hashmap;

import static java.lang.System.out;

public class RamCmp {

    static void printSize(Object o) {
        out.printf("���ͣ�%s��ռ���ڴ棺 MB\n", o.getClass());
    }

    public static void main(String[] args) throws Throwable {
        int size = 30000;

        java.util.Map<Object, Object> javaUtilHashMap = new java.util.HashMap<>();
        for (int i = 0; i < size; javaUtilHashMap.put(i, i), i++) {
        }

        java.util.ArrayList<Object> javaUtilArrayList = new java.util.ArrayList<>();
        for (int i = 0; i < size; javaUtilArrayList.add(i), i++) {
        }

        Integer[] objectArray = new Integer[size];
        for (int i = 0; i < size; objectArray[i] = i, i++) {
        }

        int[] primitiveArray = new int[size];
        for (int i = 0; i < size; primitiveArray[i] = i, i++) {
        }

        out.println("java.vm.name=" + System.getProperty("java.vm.name"));
        out.println("java.vm.version=" + System.getProperty("java.vm.version"));
        out.println("����Ԫ��������" + size);

        printSize(javaUtilHashMap);
        printSize(javaUtilArrayList);
        printSize(primitiveArray);
        printSize(objectArray);
    }
}