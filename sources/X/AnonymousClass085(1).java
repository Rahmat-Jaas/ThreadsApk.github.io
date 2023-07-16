package X;

/* renamed from: X.085  reason: invalid class name */
public final class AnonymousClass085 extends C04580Og {
    public static final AnonymousClass0KC A02 = new AnonymousClass0KC(AnonymousClass085.class, new Class[]{String.class, Object[].class}, 10);
    public String A00;
    public Object[] A01;

    public static AnonymousClass085 A00(String str, Object... objArr) {
        AnonymousClass0K4 A022;
        AnonymousClass0KC r1 = A02;
        if (r1.A03 != null) {
            A022 = AnonymousClass0KC.A01(r1, str, objArr, 0, 0);
        } else {
            A022 = AnonymousClass0KC.A02(r1, str, objArr);
        }
        return (AnonymousClass085) A022;
    }

    public final String A04() {
        String str;
        String str2;
        String str3 = this.A00;
        Object[] objArr = this.A01;
        if (str3 == null) {
            str = "N";
        } else if (objArr != null) {
            return String.format(str3, objArr);
        } else {
            str = "Y";
        }
        if (objArr != null) {
            str2 = "Y";
        } else {
            str2 = "N";
        }
        String.format("LogFragment was not initalized correctly. format msg set: %s format args set: %s", new Object[]{str, str2});
        return "";
    }

    public AnonymousClass085(boolean z, String str, Object... objArr) {
        this();
        str.getClass();
        this.A00 = str;
        objArr.getClass();
        this.A01 = objArr;
        this.A00 = true;
        this.A02 = z;
    }

    public final void A03(int i, int i2, Object obj, Object obj2) {
        Object[] objArr;
        obj.getClass();
        String str = (String) obj;
        boolean z = false;
        if (obj2 != null) {
            objArr = (Object[]) obj2;
        } else {
            objArr = new Object[0];
        }
        if (i != 0) {
            z = true;
        }
        str.getClass();
        this.A00 = str;
        objArr.getClass();
        this.A01 = objArr;
        this.A00 = true;
        this.A02 = z;
    }

    public AnonymousClass085() {
        super(true, false);
    }
}
