package com.company;


class Main{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Philemon");
        list.add("Anaman");
        list.add("Evans");
        list.add("Enoch");
        Iterator itr=list.iterator();
        System.out.println("Example 1");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Example 2 ");
        LinkedList<String> al=new LinkedList<String>();
        al.add("bread");
        al.add("beans");
        al.add("pen");
        al.add("book");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Example 3");

        Vector<String> v=new Vector<String>();
        v.add("Bread");
        v.add("beans");
        v.add("Book");
        v.add("Pen");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Example 4");

        Stack<String> stack = new Stack<String>();
        stack.push("Pen");
        stack.push("Book");
        stack.push("Beans");
        stack.push("Pen");
        stack.push("Tea");
        stack.pop();
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Example 5");

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Book ");
        deque.add("Beans");
        deque.add("Bread");
        for (String str : deque) {
            System.out.println(str);
        }

    }
}
