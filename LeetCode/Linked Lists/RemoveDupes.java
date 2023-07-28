// Question: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDupes{
    public static void main(String[] args) {
        LinkList first = new LinkList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        LinkList second = new LinkList();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        first.display();
        System.out.println();
        second.display();

        LinkList ans = LinkList.mergeTwoLists(first, second);

        ans.display();
    }
}