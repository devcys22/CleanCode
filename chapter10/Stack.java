public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<Integer>();

    public int size() {
        return topOfStack;
    }

    public void push(int element) {
        topOfStack++;
        elements.add(element);
    }

    public int pop() throws PoppedWhenEmpty {
        if (topOfStack == 0)
            throw new PoppedWhenEmpty();
        int element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
}

//- 우리는 응집도가 높은 클래스를 선호한다.
//
//    → 응집도가 높다는 소리는 클래스에 속한 메서드와 변수로 서로 의존하며 논리적인 단위로 묶인다는 의미기 때문이다.