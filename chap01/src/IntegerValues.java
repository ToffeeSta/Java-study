public class IntegerValues {
    public static void main(String[] args) {
        // 변수 선언
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        // 변수 출력(결과값)
        System.out.println("byte 최대값: " + maxByte);
        System.out.println("byte 최소값: " + minByte);
        System.out.println("short 최대값: " + maxShort);
        System.out.println("short 최소값: " + minShort);
        System.out.println("Int 최대값 : " + maxInt);
        System.out.println("Int 최소값 : " + minInt);
        System.out.println("Long 최대값 : " + maxLong);
        System.out.println("Long 최소값 : " + minLong);
    }
}
