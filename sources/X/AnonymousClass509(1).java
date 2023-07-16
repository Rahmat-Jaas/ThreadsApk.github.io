package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Map;

/* renamed from: X.509  reason: invalid class name */
public final class AnonymousClass509 extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final C112366pS A05;
    public final AnonymousClass3HX A06;
    public final C127397h3 A07;
    public final C127397h3 A08;
    public final Map A09 = new C013306f(2);

    public static C63893iY A00(PointF pointF, AnonymousClass509 r6, AnonymousClass3VO r7, Object obj) {
        r7.A02(obj, 1);
        View view = r6.A04;
        r7.A02(Float.valueOf((pointF.x * 100.0f) / ((float) view.getWidth())), 2);
        r7.A02(Float.valueOf((pointF.y * 100.0f) / ((float) view.getHeight())), 3);
        return r7.A01();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (!(motionEvent == null || motionEvent2 == null)) {
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (C18180wK.A1X((Math.abs(y) > Math.abs(x) ? 1 : (Math.abs(y) == Math.abs(x) ? 0 : -1)))) {
                i = 42;
                if (y > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i = 38;
                }
            } else {
                i = 40;
                if (x > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i = 41;
                }
            }
            C109326jp A022 = A02(i);
            if (A022 != null) {
                C127397h3 r3 = this.A08;
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(this.A07, 0);
                AnonymousClass3HX r1 = this.A06;
                A002.A02(r1, 1);
                C122047Jt.A07(r1, r3, A002, A022);
                return true;
            }
        }
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.A01 = true;
        C109326jp A022 = A02(35);
        if (A022 != null) {
            C127397h3 r3 = this.A08;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(this.A07, 0);
            AnonymousClass3HX r0 = this.A06;
            A002.A02(r0, 1);
            C122047Jt.A07(r0, r3, A002, A022);
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    private boolean A01(MotionEvent motionEvent) {
        boolean z;
        C109326jp A022 = A02(43);
        C109326jp A023 = A02(54);
        if (A022 != null) {
            C127397h3 r2 = this.A08;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(this.A07, 0);
            AnonymousClass3HX r0 = this.A06;
            A002.A02(r0, 1);
            C122047Jt.A07(r0, r2, A002, A022);
            z = true;
        } else {
            z = false;
        }
        if (A023 == null) {
            return z;
        }
        C122047Jt.A05(motionEvent, this, A023);
        return true;
    }

    public final C109326jp A02(int i) {
        Map map = this.A09;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C109326jp) map.get(valueOf);
        }
        C109326jp A0L = this.A08.A0L(i);
        map.put(valueOf, A0L);
        return A0L;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C109326jp A022 = A02(45);
        if (A022 == null) {
            A022 = A02(36);
        }
        if (A022 == null) {
            return false;
        }
        PointF A002 = this.A05.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
        C127397h3 r4 = this.A08;
        AnonymousClass3VO A003 = AnonymousClass3VO.A00();
        A003.A02(this.A07, 0);
        AnonymousClass3HX r2 = this.A06;
        C122047Jt.A03(r2, r4, A00(A002, this, A003, r2), A022);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C109326jp A022 = A02(49);
        if (A022 != null) {
            PointF A002 = this.A05.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
            C127397h3 r3 = this.A08;
            AnonymousClass3VO A003 = AnonymousClass3VO.A00();
            A003.A02(this.A07, 0);
            AnonymousClass3HX r1 = this.A06;
            C122047Jt.A03(r1, r3, A00(A002, this, A003, r1), A022);
        }
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C109326jp A022;
        if (this.A00 == null || (A022 = A02(44)) == null) {
            return false;
        }
        C127397h3 r8 = this.A08;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02(this.A07, 0);
        AnonymousClass3HX r6 = this.A06;
        A002.A02(r6, 1);
        A002.A02(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        View view = this.A04;
        C86144wL.A1L(A002, this.A00.x * 100.0f, (float) view.getWidth(), 3);
        C86144wL.A1L(A002, this.A00.y * 100.0f, (float) view.getHeight(), 4);
        C122047Jt.A07(r6, r8, A002, A022);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C109326jp A022 = A02(48);
        if (A022 != null) {
            C127397h3 r7 = this.A08;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(this.A07, 0);
            AnonymousClass3HX r6 = this.A06;
            A002.A02(r6, 1);
            View view = this.A04;
            C86144wL.A1L(A002, f * 100.0f, (float) view.getWidth(), 2);
            C86144wL.A1L(A002, f2 * 100.0f, (float) view.getHeight(), 3);
            Object A032 = C122047Jt.A03(r6, r7, A002.A01(), A022);
            if (!(A032 instanceof Boolean)) {
                C30967GcS.A02("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean A1X = AnonymousClass0wJ.A1X(A032);
                if (A1X) {
                    this.A03 = true;
                }
                this.A02 = true;
                return A1X;
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((A02(36) != null || A02(45) != null) && A01(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A02(36) == null && A02(45) == null && A01(motionEvent)) {
            return true;
        }
        return false;
    }

    public AnonymousClass509(View view, C112366pS r4, AnonymousClass3HX r5, C127397h3 r6, C127397h3 r7) {
        this.A06 = r5;
        this.A08 = r6;
        this.A07 = r7;
        this.A04 = view;
        this.A05 = r4;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = this.A05.A00(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }
}
