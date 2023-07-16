package X;

/* renamed from: X.3Fu  reason: invalid class name and case insensitive filesystem */
public final class C58473Fu {
    public Boolean A00;
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("{ QPTemplateParameter name: ");
        A0s.append(this.A02);
        A0s.append(", required: ");
        A0s.append(this.A04);
        A0s.append(", int_value: ");
        A0s.append(this.A01);
        A0s.append(", string_value: ");
        A0s.append(this.A03);
        A0s.append(", bool_value: ");
        A0s.append(this.A00);
        return C18180wK.A0i(" }", A0s);
    }
}
