package X;

/* renamed from: X.5sW  reason: invalid class name */
public final class AnonymousClass5sW extends C114786tt {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass5sW(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4);
        if (i3 > i || i4 > i2) {
            throw C18190wL.A0a("Crop rectangle does not fit within image data.");
        }
        this.A02 = bArr;
        this.A01 = i;
        this.A00 = i2;
    }
}
