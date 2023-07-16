package X;

/* renamed from: X.2Hi  reason: invalid class name and case insensitive filesystem */
public final class C33862Hi {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        Integer num;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        String A0D = C63893iY.A0D(r10, 0);
        Object A0B = C63893iY.A0B(r10, A1Z ? 1 : 0);
        A0B.getClass();
        AnonymousClass3WF.A02(A0B);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r10, 2));
        C10300i6 A0F = C63913ic.A0F(r9);
        C18200wM.A1R(A0F);
        C38039KHq A00 = AnonymousClass3LY.A00(A0F);
        Integer valueOf = Integer.valueOf(A04);
        Integer[] A1a = C18240wQ.A1a();
        int length = A1a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass006.A00;
                break;
            }
            num = A1a[i];
            int A002 = C32652Cr.A00(num);
            if (valueOf != null && A002 == A04) {
                break;
            }
            i++;
        }
        A00.CWx(new C686945c(num, A0D));
        return null;
    }
}
