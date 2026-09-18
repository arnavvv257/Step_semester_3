package OOP_Fundamentals.class_problems;

public class Q2_HostelRoom {
    String roomNo;
    int occupied;

    public static void main(String[] args) {
        Q2_HostelRoom roomA = new Q2_HostelRoom();
        Q2_HostelRoom roomB = new Q2_HostelRoom();

        roomA.roomNo = "C-101";
        roomB.roomNo = "C-102";

        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println(roomA.roomNo + " occupied: " + roomA.occupied);
        System.out.println(roomB.roomNo + " occupied: " + roomB.occupied);
    }
}
