public class Logic {

    public boolean isRightTriangle(Triangle triangle) {

        double angleSum = triangle.alphaAngle + triangle.betaAngle + triangle.gammaAngle;

        if (angleSum == 180 &&
                (triangle.alphaAngle > 0 && triangle.betaAngle > 0 && triangle.gammaAngle > 0) &&
                (triangle.alphaAngle == 90 || triangle.betaAngle == 90 || triangle.gammaAngle == 90)) {
            return true;
        } else {
            return false;
        }
    }
}
