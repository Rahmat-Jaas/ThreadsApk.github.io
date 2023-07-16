package X;

/* renamed from: X.3FG  reason: invalid class name */
public final class AnonymousClass3FG {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("TosFlow{shouldAcceptTos=");
        A0s.append(this.A01);
        A0s.append(", shouldShowExplicitTos=");
        A0s.append(this.A02);
        A0s.append(", reason=");
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLICIT_COMPONENT_STATE";
                break;
            case 2:
                str = "DEFAULT_COMPONENT_STATE";
                break;
            case 3:
                str = "UNEXPECTED_SIGNATURES_STATE";
                break;
            case 4:
                str = "APPMANAGER_NOT_INSTALLED";
                break;
            case 5:
                str = "FALLBACK_V13_NO_SIM";
                break;
            case 6:
                str = "FALLBACK_V13_EU_CANADA";
                break;
            default:
                str = "FALLBACK_V13_OUTSIDE_EU_CANADA";
                break;
        }
        A0s.append(str);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass3FG(Integer num, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }
}
