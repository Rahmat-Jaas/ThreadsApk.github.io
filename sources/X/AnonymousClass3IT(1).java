package X;

/* renamed from: X.3IT  reason: invalid class name */
public abstract class AnonymousClass3IT {
    public final AnonymousClass01V A00;

    public final int A00() {
        if (this instanceof AnonymousClass1oT) {
            return 724765212;
        }
        if (this instanceof AnonymousClass1oS) {
            return 724769976;
        }
        if (this instanceof AnonymousClass1oR) {
            return 724776576;
        }
        if (this instanceof AnonymousClass1oQ) {
            return 724769478;
        }
        return 724768394;
    }

    public final void A02(String str) {
        AnonymousClass01V r2 = this.A00;
        int A002 = A00();
        if (!r2.isMarkerOn(A002)) {
            r2.markerStart(A002);
        }
        r2.markerPoint(A002, str);
    }

    public final void A03(String str, String str2) {
        AnonymousClass01V r2 = this.A00;
        int A002 = A00();
        if (!r2.isMarkerOn(A002)) {
            r2.markerStart(A002);
        }
        r2.markerAnnotate(A002, str, str2);
    }

    public AnonymousClass3IT(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public final void A01(Integer num) {
        int intValue = num.intValue();
        short s = 3;
        if (intValue == 0) {
            s = 2;
        } else if (intValue != 1) {
            if (intValue == 2) {
                s = 4;
            } else {
                throw AnonymousClass4VZ.A00();
            }
        }
        this.A00.markerEnd(A00(), s);
    }
}
