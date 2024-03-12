package class19;

public class task03 {
    public static void main(String[] args) {
        // Create objects of each subclass and test their behavior
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Ali";
        mathTeacher.teach(); // Output: Ali teacher teaches subjects
        mathTeacher.mathTeach(); // Output: Ali teacher teaches math

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Two";
        chemistryTeacher.teach(); // Output: Two teacher teaches subjects
        chemistryTeacher.chemistry(); // Output: Two teacher teaches chemistry
    }
}

// Base class
class Teacher {
    String name;

    void teach() {
        System.out.println(name + " teacher teaches subjects");
    }
}

// Subclass 1
class MathTeacher extends Teacher {
    void mathTeach() {
        System.out.println(name + " teacher teaches math");
    }
}

// Subclass 2
class PhysicsTeacher extends Teacher {
    void physics() {
        System.out.println(name + " teacher teaches physics");
    }
}

// Subclass 3
class ChemistryTeacher extends Teacher {
    void chemistry() {
        System.out.println(name + " teacher teaches chemistry");
    }
}
