package linkedlist;

class List<A> {
    A value;
    List next;
    List previous;

    public List(A value) {
        this.value = value;
    }
}

public class ListList<A> {
    private List head;
    private List tail;

    private List find(int i) {
        if (i == 0) return head;
        int cnt = 0;
        List list = head;
        while (list != null) {
            if (cnt++ == i) return list;
            if (i < 0 && list.next == null) return list;
            list = list.next;
        }
        return null;
    }

    public void add(A value) {
        if (head == null) {
            head = new List<>(value);
            tail = head;
            return;
        }
        // find(1).next = new List<>(value);
        List list = new List<>(value);
        tail.next = list;
        list.previous = tail;
        tail = list;
    }

    public void add(int i,A value) {
        List list = head;
        int cnt = 1;
        if (i == 0) {
            head = new List<>(value);
            head.next = list;
        } else {
            while (list.next != null) {
                if (cnt == i) {
                    List newElem = new List<>(value);
                    List tmp = list.next;
                    list.next = newElem;
                    newElem.next = tmp;
                    return;
                }
                list = list.next;
                cnt++;
            }
        }
    }


    public void remove(A value) {
        List list = head;
        List tmpNxt = null;
        List tmpPre = null;
        List del = null;
        if (value == head.value) {
            head = list.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }
        } else if (value == tail.value) {
            tail = tail.previous;
            tail.next = null;
        } else {
            while (!value.equals(list.value) && list.next != null) {
                list = list.next;
                if (value.equals(list.value)) {
                    del = list;
                    tmpPre = list.previous;
                    tmpNxt = list.next;
                    tmpPre.next = tmpNxt;
                    tmpNxt.previous = tmpPre;
                    del = null;
                    return;
                }
            }
        }
    }

    public A get(int i) {
        List<A> res = find(i);
        return res == null ? null : res.value;

    }

    @Override
    public String toString() {
        return "ListList{" +
                "head=" + head.value +
                ", tail=" + tail +
                '}';
    }
}


