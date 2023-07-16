package X;

/* renamed from: X.0EY  reason: invalid class name */
public abstract class AnonymousClass0EY implements AnonymousClass0K4 {
    public AnonymousClass0KC A00 = null;
    public boolean A01;
    public boolean A02;
    public final boolean A03;

    public abstract void A03(int i, int i2, Object obj, Object obj2);

    public final void C9A(int i, int i2, Object obj, Object obj2) {
        try {
            this.A01 = false;
            this.A02 = this.A03;
            A03(i, i2, obj, obj2);
        } catch (ClassCastException e) {
            throw new RuntimeException("Failed to init ObjPoolItem cls because of likely improver type", e);
        }
    }

    public abstract void CZZ();

    public final void A02(boolean z) {
        if (this.A01) {
            throw new IllegalStateException(String.format("We have already called clean for this item %s.", new Object[]{this}));
        } else if (!z || this.A02) {
            this.A01 = true;
            this.A02 = this.A03;
            AnonymousClass0KC r0 = this.A00;
            if (r0 != null) {
                r0.A04(this);
            }
        }
    }

    public final void finalize() {
        String str;
        String str2;
        try {
            if (!this.A01) {
                if (this.A02) {
                    str = "Y";
                } else {
                    str = "N";
                }
                boolean z = this.A03;
                if (z) {
                    str2 = "Y";
                } else {
                    str2 = "N";
                }
                String.format("Forgot to call clean for this obj pool item. Cur Temp: %s Def Temp: %s", new Object[]{str, str2});
                this.A01 = true;
                this.A02 = z;
                AnonymousClass0KC r0 = this.A00;
                if (r0 != null) {
                    r0.A04(this);
                }
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    public AnonymousClass0EY(boolean z) {
        this.A03 = z;
        this.A02 = z;
    }
}
