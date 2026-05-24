package com.scalestest;

public class CollisionDetector {
    private static final Vector2D scratchVector = new Vector2D(0, 0);

    public static boolean willCollide(Square obj, Square other, double deltaTime) {
        
        scratchVector.set(obj.getPosition().getX(), obj.getPosition().getY());
        
        // 2. Add the future velocity to the scratchpad (The Look-Ahead)
        scratchVector.addScaled(obj.getVelocity(), deltaTime);
        
        // 3. Now check if 'scratchVector' intersects with 'other'
        // (Insert your AABB or circle intersection logic here)
        return checkIntersection(scratchVector, obj.getSize(), other.getPosition(), other.getSize());
    }
}
