package tp;

public class Point {
    
    public float x;
    public float y;
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String Position(float x, float y) {
        if (x == 0 && y == 0) {
            return "Le point est au centre.";
        } else {
            if (x > 0) {
                if (y > 0) {
                    return "Le point est dans la zone 1.";
                } else {
                    return "Le point est dans la zone 2.";
                }
            }
            if (x < 0) {
                if (y > 0) {
                    return "Le point est dans la zone 4.";
                } else {
                    return "Le point est dans la zone 3.";
                }
            }
        }
        return null; 
    }
    public void Avancer(int n) {
        this.x = this.x + n;
        this.y = this.y + n;
        System.out.println("Je suis un point dans le repère du plan, mes coordonnées sont : x = " + this.x + ", y = " + this.y);
    }
}
