// Chapter 9, Lesson 2 - Priority Queue Sorted List Example

public class RomanRulers implements Comparable<RomanRulers>{
    private int rulerID;
    private String rulerName;
    public RomanRulers(int id, String name) {
        rulerID = id;
        rulerName = name;
    }
    public int getRulerID() {
        return rulerID;
    }
    public String getRulerName() {
        return rulerName;
    }
    public boolean equals(RomanRulers theOther) {
        return this.getRulerID() == theOther.getRulerID();
    }
    @Override
    public int compareTo(RomanRulers theOther) {
        if(this.equals(theOther)) {
            return 0;
        }
        else if(getRulerID() > theOther.getRulerID()) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public String toString() {
        return "Ruler Succession # " + getRulerID() + "\tRuler Name: " + getRulerName();
    }
}
