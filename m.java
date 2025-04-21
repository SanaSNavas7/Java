class m {
    public static void main(String args[]) {
        StringBuffer obj = new StringBuffer("abc");
        System.out.println(obj);
        StringBuffer obj1 = new StringBuffer("def");
        System.out.println(obj + " " + obj1);
        obj.append("fgh");
        System.out.println(obj);
        String obj2 = new String("ijk");
        System.out.println(obj2);
        obj1.insert(2, "Nazrin");
        System.out.println(obj1);
        obj1.delete(2, 4);
        System.out.println(obj1);
    }
}
