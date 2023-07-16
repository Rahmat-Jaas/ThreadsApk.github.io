package X;

import com.android.internal.os.SomeArgs;

/* renamed from: X.0QS  reason: invalid class name */
public final class AnonymousClass0QS extends C019509b {
    public final SomeArgs A00;

    public final int A02(int i) {
        if (1 == i) {
            return this.A00.argi1;
        }
        try {
            return this.A00.argi2;
        } catch (NoClassDefFoundError | NoSuchFieldError e) {
            String format = String.format("Cannot access SomeArgs int field for %s%d.", new Object[]{"argi", Integer.valueOf(i)});
            AnonymousClass0F8.A00.A03(format, e);
            throw new AnonymousClass0KI(format, e);
        }
    }

    public final Object A03(int i) {
        try {
            return this.A00.arg1;
        } catch (NoClassDefFoundError | NoSuchFieldError e) {
            String format = String.format("Cannot access SomeArgs obj field for %s%d.", new Object[]{"arg", 1});
            AnonymousClass0F8.A00.A03(format, e);
            throw new AnonymousClass0KI(format, e);
        }
    }

    public /* synthetic */ AnonymousClass0QS(SomeArgs someArgs) {
        this.A00 = someArgs;
    }
}
