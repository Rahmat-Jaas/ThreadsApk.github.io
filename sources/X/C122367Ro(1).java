package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7Ro  reason: invalid class name and case insensitive filesystem */
public final class C122367Ro implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    public C122367Ro(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float f2 = 100.0f * C18230wP.A0E(view.getContext()).density;
        if (f2 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f = f2 + 0.5f;
        } else {
            f = f2 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        int i;
        C109326jp A0L;
        Rect A0D = C86134wK.A0D();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(A0D);
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            i = point.y - view.getRootWindowInsets().getStableInsetBottom();
        } else {
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - A0D.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<C109666kN> list = this.A03;
                synchronized (list) {
                    for (C109666kN r9 : list) {
                        if (r9 != null) {
                            C127397h3 r1 = r9.A03;
                            C109326jp A0L2 = r1.A0L(43);
                            if (A0L2 != null) {
                                C127397h3 r4 = r9.A02;
                                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                                A002.A02(r4, 0);
                                AnonymousClass3HX r2 = r9.A01;
                                A002.A02(r2, 1);
                                A002.A02(Integer.valueOf((int) (((float) i2) / C18230wP.A0E(r9.A00).density)), 2);
                                C122047Jt.A07(r2, r4, A002, A0L2);
                            } else {
                                C109326jp A08 = C127397h3.A08(r1);
                                if (A08 != null) {
                                    C122047Jt.A03(r9.A01, r9.A02, AnonymousClass3VO.A00().A01(), A08);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 > i3) {
            List<C109666kN> list2 = this.A03;
            synchronized (list2) {
                for (C109666kN r22 : list2) {
                    if (!(r22 == null || (A0L = r22.A03.A0L(38)) == null)) {
                        C127397h3 r42 = r22.A02;
                        AnonymousClass3VO A003 = AnonymousClass3VO.A00();
                        A003.A02(r42, 0);
                        AnonymousClass3HX r23 = r22.A01;
                        A003.A02(r23, 1);
                        A003.A02(Integer.valueOf((int) (((float) i2) / C18230wP.A0E(r22.A00).density)), 2);
                        C122047Jt.A07(r23, r42, A003, A0L);
                    }
                }
            }
        } else if (i2 < i3) {
            this.A00 = false;
            List<C109666kN> list3 = this.A03;
            synchronized (list3) {
                for (C109666kN r5 : list3) {
                    if (r5 != null) {
                        C127397h3 r12 = r5.A03;
                        C109326jp A0L3 = r12.A0L(42);
                        if (A0L3 != null) {
                            C127397h3 r3 = r5.A02;
                            AnonymousClass3VO A004 = AnonymousClass3VO.A00();
                            A004.A02(r3, 0);
                            AnonymousClass3HX r0 = r5.A01;
                            A004.A02(r0, 1);
                            C122047Jt.A07(r0, r3, A004, A0L3);
                        } else {
                            C109326jp A0V = C18230wP.A0V(r12);
                            if (A0V != null) {
                                C122047Jt.A03(r5.A01, r5.A02, AnonymousClass3VO.A00().A01(), A0V);
                            }
                        }
                    }
                }
            }
        }
    }
}
