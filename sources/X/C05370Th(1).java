package X;

/* renamed from: X.0Th  reason: invalid class name and case insensitive filesystem */
public final class C05370Th {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "NULL_VALUE";
            case 1:
                return "SESSIONLESS";
            case 2:
                return "SESSIONBASED";
            case 3:
                return "PAGEID";
            case 4:
                return "ADMINID";
            case 6:
                return "GROUP";
            case 7:
                return "FAMILY_DEVICE_ID";
            case 8:
                return "FRLID";
            default:
                throw new IllegalArgumentException(String.format("%d is not a MobileConfigUnitType", new Object[]{Integer.valueOf(i)}));
        }
    }
}
