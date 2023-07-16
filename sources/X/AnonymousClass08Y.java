package X;

import com.facebook.common.mindeputils.ILogPart;
import java.util.concurrent.Callable;

/* renamed from: X.08Y  reason: invalid class name */
public final class AnonymousClass08Y extends C04580Og {
    public static final AnonymousClass0KC A04 = new AnonymousClass0KC(AnonymousClass08Y.class, new Class[]{Integer.TYPE, Boolean.TYPE, Callable.class, ILogPart.class}, 7);
    public Callable A00;
    public boolean A01;
    public boolean A02;
    public ILogPart A03;

    public final String A04() {
        boolean z;
        if (this.A02) {
            z = this.A01;
        } else {
            Callable callable = this.A00;
            if (callable != null) {
                try {
                    Boolean bool = (Boolean) callable.call();
                    if (bool != null) {
                        z = bool.booleanValue();
                        this.A01 = z;
                        this.A02 = true;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            z = false;
        }
        if (!z) {
            return "";
        }
        ILogPart iLogPart = this.A03;
        if (iLogPart != null) {
            return C04580Og.A01((C04580Og) iLogPart, true);
        }
        return "<Log Err: No If LogFrag>";
    }

    public final void CZZ() {
        ILogPart iLogPart = this.A03;
        this.A03 = null;
        AnonymousClass0KC.A03(iLogPart, true);
        super.CZZ();
    }

    public AnonymousClass08Y(int i, boolean z, Callable callable, ILogPart iLogPart) {
        this();
        newInitWith(i, z, callable, iLogPart);
    }

    public void newInitWith(int i, boolean z, Callable callable, ILogPart iLogPart) {
        iLogPart.getClass();
        this.A03 = iLogPart;
        boolean z2 = true;
        switch (i) {
            case 103:
                this.A01 = z;
                this.A02 = true;
                break;
            case 104:
                this.A01 = false;
                this.A02 = false;
                callable.getClass();
                this.A00 = callable;
                return;
            case 105:
                this.A01 = false;
                this.A02 = false;
                break;
            default:
                throw new IllegalArgumentException(String.format("ConditionalLogFragment type %d not understood", new Object[]{Integer.valueOf(i)}));
        }
        if (callable != null) {
            z2 = false;
        }
        AnonymousClass0KW.A03(z2);
        this.A00 = null;
    }

    public AnonymousClass08Y(Callable callable, String str, Object... objArr) {
        this(callable, (ILogPart) AnonymousClass085.A00(str, objArr));
    }

    public AnonymousClass08Y(String str, Object... objArr) {
        this(AnonymousClass085.A00(str, objArr));
    }

    public AnonymousClass08Y(ILogPart iLogPart) {
        this(105, false, (Callable) null, iLogPart);
    }

    public AnonymousClass08Y(Callable callable, ILogPart iLogPart) {
        this(104, false, callable, iLogPart);
    }

    public AnonymousClass08Y(boolean z, String str, Object... objArr) {
        this(z, (ILogPart) AnonymousClass085.A00(str, objArr));
    }

    public AnonymousClass08Y(boolean z, ILogPart iLogPart) {
        this(103, z, (Callable) null, iLogPart);
    }

    public AnonymousClass08Y() {
        super(false, true);
        this.A03 = null;
    }
}
