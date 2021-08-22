package projects.tests;

public class LinkedLIst<T> {
    /*В классе будем хранить ссылку только на голову*/
    private Node<T> head;

    /*Определим контракт нашего LinkedList*/
    /*Метод добавления элемента в начало нашего LinkedList*/
    public void addFirst(T t) {
        /*Создаём ноду, в которую передаём входящий параметр метода*/
        Node<T> firstNode = new Node<>(t);
        /*Определяем, что новая нода указывает ссылкой next на голову. То есть стоит на первом месте в LL*/
        firstNode.next = head;
        /*Следующей строкой мы говорим, что голова теперь - это наша новая нода*/
        head = firstNode;
    }

    /*Метод добавления элемента в хвост нашего LinkedList*/
    public void addLast(T t) {
        /*Проверяем не пустой ли наш LinkedList*/
        if (head == null) {
            /*Если LL пустой, то есть его головной элемент равен null. То голова равна новой ноде со значением входящего
             *в метод параметра*/
            head = new Node<>(t);
            /*И заканчиваем работу метода*/
            return;
        }
        /*Если же условия выше не произошло и элементы в LinkedList есть, создаём новую ноду currentNode, которая равно
         * головному элементу. Это нужно, чтобы иметь возможность пробежаться по элементам LinkedList*/
        Node<T> currentNode = head;
        /*Пока текущая нода не дойдёт до конца, то есть пока она ссылается на следующий элемент*/
        while (currentNode.next != null) {
            /*Текущая нода ссылается на следующий элемент*/
            currentNode = currentNode.next;
        }
        /*Этой строчкой добавляем элемент в конец LL*/
        currentNode.next = new Node<>(t);
    }

    /*Метод поиска элемента по значению. Возвращаем псевдоиндекс или -1, если элемент не найден*/
    public int get(T t) {
        /*Проверяем LinkedList на пустоту*/
        if (head == null) {
            /*Если он пустой, тогда возвращаем -1, говоря этим, что такого элемента нет*/
            return -1;
        }
        /*Если элемент (head) содержит значение(.value), которое мы ищем (t)*/
        if (head.value == t) {
            /*Тогда возвращаем 0, тем самым говоря то, что элемент является первым*/
            return 0;
        }
        /*Если же вышеуказанных условий не произошло, тогда создаём новую ноду, которая будет головным элементом*/
        Node<T> currentNode = head;
        int result = 0;
        /*Создаём цикл. Пока текущий элемент не является последним, то есть его ссылка не следующий элемент не равно
         * null*/
        while (currentNode.next != null) {
            /*Инкрементируем свой результат*/
            ++result;
            /*Если значение следующего элемента(currentNode.next.value) равно искомому (t)*/
            if (currentNode.next.value == t) {
                /*То возвращаем результат*/
                return result;
            }
            /*А если вышеуказанных условий не произошло, то передвигаем свой указатель*/
            currentNode = currentNode.next;
        }
        /*Если не нашли никакого значения, то возвращаем -1*/
        return -1;
    }

    /*Метод поиска и удаления элемента по значению из LinkedList*/
    public void remove(T t) {
        /*Проверяем LinkedList на пустоту*/
        if (head == null) {
            /*Если он пустой, тогда возвращаемся из метода обратно*/
            return;
        }
        /*Если значение головного элемента равно искомому значению*/
        if (head.value == t) {
            /*Тогда выкидываем его из нашего LL*/
            head = head.next;
            return;
        }
        /*Если вышеуказанного не произошло, то мы создаём новую ноду, которая равна головной ноде, то есть сама будет
         * являться головным элементом списка*/
        Node<T> currentNode = head;
        /*Создаём цикл. Пока текущий элемент не является последним, то есть его ссылка не следующий элемент не равно
         * null*/
        while (currentNode.next != null) {
            /*Если значение следующего элемента(currentNode.next.value) равно искомому (t)*/
            if (currentNode.next.value == t) {
                /*То передвигаем указатель next на следующий элемент*/
                currentNode.next = currentNode.next.next;
                return;
            }
            /*Передвигаемся на следующую ноду, если это необходимо*/
            currentNode = currentNode.next;
        }
    }

    /*В первую очередь надо определить первую ноду, то элемент, который содержит значение и ссылку на следующий элемент.
     * Для этого создаём приватный статический класс под названием Node. Для того, чтобы мы могли хранить разные типы
     * данных, указываем Generic*/
    private static class Node<T> {
        /*Данный класс содержит в себе final элемент value*/
        private final T value;
        /*И также этот класс содержит в себе ссылку на следующий элемент*/
        private Node<T> next;

        /*Создаём конструктор*/
        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{"
                    + "value="
                    + value
                    + ", next="
                    + next
                    + '}';
        }
    }

    @Override
    public String toString() {
        return "LinkedLIst{"
                + "head="
                + head
                + '}';
    }
}
