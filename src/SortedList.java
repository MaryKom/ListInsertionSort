public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public SortedList(Link[] arr) {
        first = null;
        for (int j = 0; j < arr.length; j++)
            insert(arr[j]);
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(Link k) {
        Link previous = null;
        Link current = first;

        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = k;
        else
            previous.next = k;
        k.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
