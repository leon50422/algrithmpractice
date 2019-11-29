public class Day3 {
    public static LNode merge(LNode l1, LNode l2){
        LNode retVal = null;
        LNode retTail = null;
        LNode curr = l1;
        LNode sel = l2;
        while (curr != null){
            if (curr.val <= sel.val ){
                if (retVal == null){
                    retVal = curr;
                    retTail = retVal;
                }
                else {
                    LNode l = retTail;
                    l.next = curr;
                    retTail = curr;
                }
                curr = curr.next;
            }
            else {
                LNode temp = curr;
                curr = sel;
                sel = temp;
            }
        }
        if  (sel !=null){
            retTail.next = sel;
        }
        return retVal;
    }

    public static void main(String[] args) {
        LNode l10 = new LNode(1);
        LNode l11 = new LNode(2);
        LNode l12 = new LNode(2);
        LNode l13 = new LNode(5);
        LNode l14 = new LNode(5);
        LNode l15 = new LNode(6);
        LNode l16 = new LNode(9);
        LNode l17 = new LNode(10);
        l10.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l15.next = l16;
        l16.next = l17;
        LNode l20 = new LNode(1);
        LNode l21 = new LNode(2);
        LNode l22 = new LNode(3);
        LNode l23 = new LNode(4);
        LNode l24 = new LNode(4);
        LNode l25 = new LNode(7);
        LNode l26 = new LNode(8);
        LNode l27 = new LNode(10);
        LNode l28 = new LNode(11);
        l20.next = l21;
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;
        l25.next = l26;
        l26.next = l27;
        l27.next = l28;
        LNode ret = Day3.merge(l10, l20);
        while (ret!=null){
            System.out.print(ret.val);
            ret = ret.next;
        }
    }
}

class LNode {
    int val;
    LNode next;
    public LNode(int i) {
    val = i;
    }
}
