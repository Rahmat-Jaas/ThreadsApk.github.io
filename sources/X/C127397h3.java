package X;

import android.text.Layout;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7h3  reason: invalid class name and case insensitive filesystem */
public class C127397h3 implements C143468gn {
    public static final C82344pT A08 = new C130637qP();
    public int A00;
    public Set A01;
    public final int A02;
    public final int A03;
    public final SparseArray A04;
    public final C127397h3 A05;
    public final LinkedList A06;
    public final List A07;

    public static C127377h1 A02(C112976qV r3, M5L m5l, int i, int i2) {
        View view = (View) m5l.A09().AFU(r3.A04);
        view.measure(i, i2);
        return new C127377h1(m5l, i, i2, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static C127377h1 A03(M5L m5l, int i, int i2) {
        return new C127377h1(m5l, i, i2, View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public static C90955fM A07(AnonymousClass3HX r4, int i) {
        boolean booleanValue;
        long j = (long) i;
        Boolean bool = (Boolean) r4.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new C90955fM(r4, j, booleanValue);
    }

    public final C109326jp A0L(int i) {
        BloksScript bloksScript;
        List list;
        int i2 = i;
        Object A0A = A0A(this, i);
        if (A0A == null) {
            return null;
        }
        if (A0A instanceof BloksScript) {
            bloksScript = (BloksScript) A0A;
            list = this.A07;
            bloksScript.getClass();
        } else if (A0A instanceof C109326jp) {
            return (C109326jp) A0A;
        } else {
            if (A0A instanceof C105916eC) {
                return ((C105916eC) A0A).A00;
            }
            String str = (String) A0A;
            C04220Ms.A0B(str, 2);
            bloksScript = new BloksScript(str, this.A02, this.A03, i2, C86114wI.A0m(this.A04, 128));
            list = this.A07;
        }
        return new C109326jp(bloksScript, (C109346jr) null, list);
    }

    public final void A0S(C144528ie r5) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            if (i < sparseArray.size()) {
                Object valueAt = sparseArray.valueAt(i);
                if (valueAt == null) {
                    C30967GcS.A02("BloksModel", "Null value found during traversal");
                } else {
                    r5.DAY(sparseArray.keyAt(i), valueAt);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static int A01(C111076mk r1) {
        Layout layout = r1.A02;
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (A0G(145, com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.M5L A04(X.M5L r5, X.AnonymousClass3HX r6) {
        /*
            r4 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r4.A0G(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r4.A0G(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r4.A0G(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r4.A0G(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r4.A0G(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r4.A0G(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r3 = 1
        L_0x0041:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r2 = r4.A0R(r0)
            if (r3 != 0) goto L_0x0058
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0058
            if (r5 == 0) goto L_0x0057
            java.lang.Integer r1 = r5.A04
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x0058
        L_0x0057:
            return r5
        L_0x0058:
            if (r5 == 0) goto L_0x0067
            java.lang.Integer r1 = r5.A04
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x006d
            java.lang.String r0 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0067:
            int r0 = r4.A02
            X.5fM r5 = A07(r6, r0)
        L_0x006d:
            r1 = 2131297448(0x7f0904a8, float:1.8212841E38)
            X.4pT r0 = A08
            java.lang.Object r1 = r6.A01(r0, r4, r1)
            X.6e6 r1 = (X.C105856e6) r1
            X.7hg r0 = new X.7hg
            r0.<init>(r1)
            X.C86124wJ.A1N(r0, r5)
            if (r3 == 0) goto L_0x008a
            X.7hf r0 = new X.7hf
            r0.<init>(r4)
            X.C86124wJ.A1N(r0, r5)
        L_0x008a:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            X.7hp r0 = new X.7hp
            r0.<init>(r6, r4, r1)
            X.C86124wJ.A1N(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127397h3.A04(X.M5L, X.3HX):X.M5L");
    }

    public static C127397h3 A05(C127397h3 r1) {
        return r1.A0K(35);
    }

    public static C127397h3 A06(C127397h3 r1) {
        return r1.A0K(132);
    }

    public static C109326jp A08(C127397h3 r1) {
        return r1.A0L(36);
    }

    public static Object A0A(C127397h3 r0, int i) {
        return r0.A04.get(i);
    }

    public static String A0B(C127397h3 r1) {
        return r1.A0N(38);
    }

    public static String A0C(C127397h3 r1) {
        return r1.A0N(40);
    }

    public static String A0D(C127397h3 r1) {
        return r1.A0N(41);
    }

    public static String A0E(C127397h3 r1) {
        return r1.A0N(42);
    }

    public final View A0J(AnonymousClass3HX r3) {
        if (r3 == null) {
            return null;
        }
        return ((C105856e6) r3.A01(A08, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    public final C127397h3 A0K(int i) {
        Object obj;
        SparseArray sparseArray = this.A04;
        Object obj2 = sparseArray.get(i);
        if (obj2 instanceof List) {
            List A0Q = A0Q(i);
            if (A0Q.isEmpty()) {
                return null;
            }
            obj = C18240wQ.A0b(A0Q);
        } else if (!(obj2 instanceof C127397h3)) {
            return null;
        } else {
            obj = sparseArray.get(i);
        }
        return (C127397h3) obj;
    }

    public final String A0M() {
        Object A0A = A0A(this, 33);
        if (A0A == null) {
            return null;
        }
        if (A0A instanceof String) {
            return (String) A0A;
        }
        if (A0A instanceof Number) {
            return String.valueOf(C18190wL.A08(A0A));
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Bloks id only supports long and String types but got: ", A0A));
    }

    public final String A0N(int i) {
        return C86114wI.A0m(this.A04, i);
    }

    public final String A0O(int i, String str) {
        String A0m = C86114wI.A0m(this.A04, i);
        if (A0m != null) {
            return A0m;
        }
        return str;
    }

    public C127397h3(List list, int i, int i2) {
        this.A06 = null;
        this.A04 = new SparseArray(i2 + 1);
        this.A03 = i;
        this.A02 = AnonymousClass6YG.A00.incrementAndGet();
        this.A07 = list;
        this.A05 = null;
        AnonymousClass326.A03.incrementAndGet();
    }

    public static float A00(C127397h3 r0, int i) {
        String A0N = r0.A0N(i);
        if (A0N != null) {
            return AnonymousClass7Kk.A01(A0N);
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public static Object A09(C112976qV r0, M5L m5l) {
        return m5l.A09().AFU(r0.A04);
    }

    public static String A0F(C127397h3 r0, String str, int i) {
        String A0O = r0.A0O(i, str);
        C04220Ms.A06(A0O);
        return A0O;
    }

    public final float A0G(int i, float f) {
        Number number = (Number) A0A(this, i);
        if (number != null) {
            return number.floatValue();
        }
        return f;
    }

    public final int A0H(int i, int i2) {
        Object A0A = A0A(this, i);
        if (A0A == null) {
            return i2;
        }
        if (!(A0A instanceof String)) {
            return AnonymousClass0wJ.A04(A0A);
        }
        try {
            return Integer.parseInt((String) A0A);
        } catch (NumberFormatException unused) {
            C30967GcS.A02("BloksModel", "Non-int string parsed as int");
            return i2;
        }
    }

    public final long A0I(int i, long j) {
        Object A0A = A0A(this, i);
        if (A0A == null) {
            return j;
        }
        if (!(A0A instanceof String)) {
            return C18190wL.A08(A0A);
        }
        try {
            return Long.parseLong((String) A0A);
        } catch (NumberFormatException unused) {
            C30967GcS.A02("BloksModel", "Non-long string parsed as long");
            return j;
        }
    }

    public final List A0P() {
        int intValue;
        List A0Q;
        AnonymousClass794.A00();
        Integer A002 = AnonymousClass3LX.A00(this);
        if (A002 == null || (intValue = A002.intValue()) == -1 || (A0Q = A0Q(intValue)) == null) {
            return Collections.emptyList();
        }
        return A0Q;
    }

    public final List A0Q(int i) {
        Object A0A = A0A(this, i);
        if (A0A == null) {
            return Collections.emptyList();
        }
        if (!(A0A instanceof C127397h3)) {
            return (List) A0A;
        }
        ArrayList A0k = C18240wQ.A0k(1);
        A0k.add(A0A);
        return A0k;
    }

    public final List A0R(int i) {
        List list = (List) A0A(this, i);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final boolean A0T(int i, boolean z) {
        return AnonymousClass2LL.A00(A0A(this, i), z);
    }

    public final boolean A0U(C144568ii r8) {
        if (!r8.DAZ(this)) {
            AnonymousClass7H4 r0 = AnonymousClass794.A00().A02;
            int i = this.A03;
            int[] A022 = r0.A02(i);
            int i2 = 0;
            while (i2 < A022.length) {
                C127397h3 A0K = A0K(A022[i2]);
                if (A0K == null || !A0K.A0U(r8)) {
                    i2++;
                }
            }
            int[] A012 = AnonymousClass794.A00().A02.A01(i);
            for (int A0Q : A012) {
                List A0Q2 = A0Q(A0Q);
                for (int i3 = 0; i3 < A0Q2.size(); i3++) {
                    C127397h3 A0Q3 = C86154wM.A0Q(A0Q2, i3);
                    if (A0Q3 != null && A0Q3.A0U(r8)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.M5L] */
    /* JADX WARNING: type inference failed for: r4v547 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v249 */
    /* JADX WARNING: type inference failed for: r2v250 */
    /* JADX WARNING: type inference failed for: r2v251 */
    /* JADX WARNING: type inference failed for: r2v269, types: [X.M5L, X.5fL] */
    /* JADX WARNING: type inference failed for: r10v181, types: [X.5AG] */
    /* JADX WARNING: type inference failed for: r10v182, types: [X.5AH] */
    /* JADX WARNING: type inference failed for: r0v881 */
    /* JADX WARNING: type inference failed for: r0v882 */
    /* JADX WARNING: type inference failed for: r0v883 */
    /* JADX WARNING: type inference failed for: r0v884 */
    /* JADX WARNING: type inference failed for: r5v310, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v885 */
    /* JADX WARNING: type inference failed for: r5v311, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r19v61, types: [X.7h0] */
    /* JADX WARNING: type inference failed for: r0v886 */
    /* JADX WARNING: type inference failed for: r0v887 */
    /* JADX WARNING: type inference failed for: r0v888 */
    /* JADX WARNING: type inference failed for: r5v312, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v889 */
    /* JADX WARNING: type inference failed for: r0v890 */
    /* JADX WARNING: type inference failed for: r0v891 */
    /* JADX WARNING: type inference failed for: r0v892 */
    /* JADX WARNING: type inference failed for: r0v893 */
    /* JADX WARNING: type inference failed for: r0v894 */
    /* JADX WARNING: type inference failed for: r0v895 */
    /* JADX WARNING: type inference failed for: r0v896 */
    /* JADX WARNING: type inference failed for: r0v897 */
    /* JADX WARNING: type inference failed for: r0v898 */
    /* JADX WARNING: type inference failed for: r10v241, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r5v313, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r10v242, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r5v314, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v899 */
    /* JADX WARNING: type inference failed for: r0v900 */
    /* JADX WARNING: type inference failed for: r0v901 */
    /* JADX WARNING: type inference failed for: r5v315, types: [X.7h0] */
    /* JADX WARNING: type inference failed for: r0v902 */
    /* JADX WARNING: type inference failed for: r0v903 */
    /* JADX WARNING: type inference failed for: r0v904 */
    /* JADX WARNING: type inference failed for: r5v316, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v905 */
    /* JADX WARNING: type inference failed for: r0v906 */
    /* JADX WARNING: type inference failed for: r0v907 */
    /* JADX WARNING: type inference failed for: r0v908 */
    /* JADX WARNING: type inference failed for: r0v909 */
    /* JADX WARNING: type inference failed for: r0v910 */
    /* JADX WARNING: type inference failed for: r6v138, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v911 */
    /* JADX WARNING: type inference failed for: r0v912 */
    /* JADX WARNING: type inference failed for: r0v913 */
    /* JADX WARNING: type inference failed for: r0v914 */
    /* JADX WARNING: type inference failed for: r0v915 */
    /* JADX WARNING: type inference failed for: r0v916 */
    /* JADX WARNING: type inference failed for: r0v917 */
    /* JADX WARNING: type inference failed for: r5v317, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v918 */
    /* JADX WARNING: type inference failed for: r0v919 */
    /* JADX WARNING: type inference failed for: r4v685, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v920 */
    /* JADX WARNING: type inference failed for: r0v921 */
    /* JADX WARNING: type inference failed for: r0v922 */
    /* JADX WARNING: type inference failed for: r0v923 */
    /* JADX WARNING: type inference failed for: r0v924 */
    /* JADX WARNING: type inference failed for: r0v925 */
    /* JADX WARNING: type inference failed for: r0v926 */
    /* JADX WARNING: type inference failed for: r0v927 */
    /* JADX WARNING: type inference failed for: r0v928 */
    /* JADX WARNING: type inference failed for: r0v929 */
    /* JADX WARNING: type inference failed for: r6v139, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v930 */
    /* JADX WARNING: type inference failed for: r0v931 */
    /* JADX WARNING: type inference failed for: r0v932 */
    /* JADX WARNING: type inference failed for: r6v140, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v933 */
    /* JADX WARNING: type inference failed for: r0v934 */
    /* JADX WARNING: type inference failed for: r0v935 */
    /* JADX WARNING: type inference failed for: r6v141, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r10v243, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r4v686, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v936 */
    /* JADX WARNING: type inference failed for: r0v937 */
    /* JADX WARNING: type inference failed for: r0v938 */
    /* JADX WARNING: type inference failed for: r19v62, types: [X.7h0] */
    /* JADX WARNING: type inference failed for: r11v156, types: [X.7gz] */
    /* JADX WARNING: type inference failed for: r10v244, types: [X.7gz] */
    /* JADX WARNING: type inference failed for: r0v940 */
    /* JADX WARNING: type inference failed for: r5v319, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r6v142, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v941 */
    /* JADX WARNING: type inference failed for: r10v245, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v942 */
    /* JADX WARNING: type inference failed for: r0v943 */
    /* JADX WARNING: type inference failed for: r0v944 */
    /* JADX WARNING: type inference failed for: r10v246, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r10v247, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r10v248, types: [X.7h1] */
    /* JADX WARNING: type inference failed for: r0v945 */
    /* JADX WARNING: type inference failed for: r2v337 */
    /* JADX WARNING: type inference failed for: r2v338 */
    /* JADX WARNING: type inference failed for: r2v339 */
    /* JADX WARNING: type inference failed for: r2v340 */
    /* JADX WARNING: type inference failed for: r2v341 */
    /* JADX WARNING: type inference failed for: r2v342 */
    /* JADX WARNING: type inference failed for: r2v343 */
    /* JADX WARNING: type inference failed for: r2v344 */
    /* JADX WARNING: type inference failed for: r2v345 */
    /* JADX WARNING: type inference failed for: r2v346 */
    /* JADX WARNING: type inference failed for: r2v347 */
    /* JADX WARNING: type inference failed for: r2v348 */
    /* JADX WARNING: type inference failed for: r2v349 */
    /* JADX WARNING: type inference failed for: r2v350 */
    /* JADX WARNING: type inference failed for: r2v351 */
    /* JADX WARNING: type inference failed for: r2v352 */
    /* JADX WARNING: type inference failed for: r2v353 */
    /* JADX WARNING: type inference failed for: r2v354 */
    /* JADX WARNING: type inference failed for: r2v355 */
    /* JADX WARNING: type inference failed for: r2v356 */
    /* JADX WARNING: type inference failed for: r2v357 */
    /* JADX WARNING: type inference failed for: r19v64, types: [X.5fP] */
    /* JADX WARNING: type inference failed for: r19v65, types: [X.5fP] */
    /* JADX WARNING: type inference failed for: r2v358 */
    /* JADX WARNING: type inference failed for: r2v359 */
    /* JADX WARNING: type inference failed for: r2v360 */
    /* JADX WARNING: type inference failed for: r2v361 */
    /* JADX WARNING: type inference failed for: r2v362 */
    /* JADX WARNING: type inference failed for: r25v34, types: [X.9Uc] */
    /* JADX WARNING: type inference failed for: r2v363 */
    /* JADX WARNING: type inference failed for: r2v365 */
    /* JADX WARNING: type inference failed for: r2v366 */
    /* JADX WARNING: type inference failed for: r2v367 */
    /* JADX WARNING: type inference failed for: r2v368 */
    /* JADX WARNING: type inference failed for: r2v369 */
    /* JADX WARNING: type inference failed for: r2v370 */
    /* JADX WARNING: type inference failed for: r19v66, types: [X.5zc] */
    /* JADX WARNING: type inference failed for: r2v371 */
    /* JADX WARNING: type inference failed for: r2v372 */
    /* JADX WARNING: type inference failed for: r2v374 */
    /* JADX WARNING: type inference failed for: r2v375 */
    /* JADX WARNING: type inference failed for: r2v376 */
    /* JADX WARNING: type inference failed for: r2v377 */
    /* JADX WARNING: type inference failed for: r2v378 */
    /* JADX WARNING: type inference failed for: r19v67, types: [X.9Ue] */
    /* JADX WARNING: type inference failed for: r2v379 */
    /* JADX WARNING: type inference failed for: r2v380 */
    /* JADX WARNING: type inference failed for: r2v381 */
    /* JADX WARNING: type inference failed for: r2v382 */
    /* JADX WARNING: type inference failed for: r2v383 */
    /* JADX WARNING: type inference failed for: r2v384 */
    /* JADX WARNING: type inference failed for: r2v385 */
    /* JADX WARNING: type inference failed for: r2v387 */
    /* JADX WARNING: type inference failed for: r2v388 */
    /* JADX WARNING: type inference failed for: r2v389 */
    /* JADX WARNING: type inference failed for: r2v390 */
    /* JADX WARNING: type inference failed for: r2v391 */
    /* JADX WARNING: type inference failed for: r2v392 */
    /* JADX WARNING: type inference failed for: r2v393 */
    /* JADX WARNING: type inference failed for: r2v394 */
    /* JADX WARNING: type inference failed for: r2v395 */
    /* JADX WARNING: type inference failed for: r2v396 */
    /* JADX WARNING: type inference failed for: r2v397 */
    /* JADX WARNING: type inference failed for: r2v398 */
    /* JADX WARNING: type inference failed for: r2v399 */
    /* JADX WARNING: type inference failed for: r2v400 */
    /* JADX WARNING: type inference failed for: r2v401 */
    /* JADX WARNING: type inference failed for: r19v68, types: [X.9S2] */
    /* JADX WARNING: type inference failed for: r19v69, types: [X.9S3] */
    /* JADX WARNING: type inference failed for: r19v70, types: [X.9S1] */
    /* JADX WARNING: type inference failed for: r19v71, types: [X.9S4] */
    /* JADX WARNING: type inference failed for: r2v402 */
    /* JADX WARNING: type inference failed for: r2v403 */
    /* JADX WARNING: type inference failed for: r2v404 */
    /* JADX WARNING: type inference failed for: r2v405 */
    /* JADX WARNING: type inference failed for: r2v406 */
    /* JADX WARNING: type inference failed for: r2v407 */
    /* JADX WARNING: type inference failed for: r2v408 */
    /* JADX WARNING: type inference failed for: r2v409 */
    /* JADX WARNING: type inference failed for: r2v410 */
    /* JADX WARNING: type inference failed for: r2v411 */
    /* JADX WARNING: type inference failed for: r2v412 */
    /* JADX WARNING: type inference failed for: r2v414 */
    /* JADX WARNING: type inference failed for: r2v415 */
    /* JADX WARNING: type inference failed for: r2v416 */
    /* JADX WARNING: type inference failed for: r2v417 */
    /* JADX WARNING: type inference failed for: r2v422 */
    /* JADX WARNING: type inference failed for: r2v424 */
    /* JADX WARNING: type inference failed for: r4v687 */
    /* JADX WARNING: type inference failed for: r4v688 */
    /* JADX WARNING: type inference failed for: r4v689 */
    /* JADX WARNING: type inference failed for: r0v946 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0c79: MOVE  (r1v291 int) = (r24v19 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1301:0x1d45  */
    /* JADX WARNING: Removed duplicated region for block: B:1303:0x1d4d  */
    /* JADX WARNING: Removed duplicated region for block: B:1716:0x27ca  */
    /* JADX WARNING: Removed duplicated region for block: B:1722:0x27e7  */
    /* JADX WARNING: Removed duplicated region for block: B:1726:0x27fe  */
    /* JADX WARNING: Removed duplicated region for block: B:1728:0x281a  */
    /* JADX WARNING: Removed duplicated region for block: B:1737:0x28a1  */
    /* JADX WARNING: Removed duplicated region for block: B:1739:0x28ad  */
    /* JADX WARNING: Removed duplicated region for block: B:1753:0x2900  */
    /* JADX WARNING: Removed duplicated region for block: B:1761:0x291b  */
    /* JADX WARNING: Removed duplicated region for block: B:1764:0x2920  */
    /* JADX WARNING: Removed duplicated region for block: B:1767:0x2926  */
    /* JADX WARNING: Removed duplicated region for block: B:2083:0x3027  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x052f A[Catch:{ 1zB -> 0x3265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0ceb  */
    /* JADX WARNING: Removed duplicated region for block: B:644:0x0d08  */
    /* JADX WARNING: Removed duplicated region for block: B:653:0x0d44  */
    /* JADX WARNING: Removed duplicated region for block: B:655:0x0d67  */
    /* JADX WARNING: Removed duplicated region for block: B:744:0x0ed2  */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x0ede  */
    public final X.C41822MeD ABY(X.C112976qV r56, int r57, int r58) {
        /*
            r55 = this;
            r7 = r56
            r8 = r57
            X.Lyh r18 = r7.A00()
            r0 = r18
            X.LmH r0 = r0.A00
            r3 = r55
            r9 = r58
            if (r0 == 0) goto L_0x005a
            java.util.Map r0 = r0.A01
            java.lang.Object r4 = r0.get(r3)
            X.MeD r4 = (X.C41822MeD) r4
            if (r4 == 0) goto L_0x005a
            int r1 = r4.BMC()
            int r0 = r4.getWidth()
            boolean r0 = X.C101076Pu.A00(r1, r8, r0)
            if (r0 == 0) goto L_0x005a
            int r1 = r4.Aml()
            int r0 = r4.getHeight()
            boolean r0 = X.C101076Pu.A00(r1, r9, r0)
            if (r0 == 0) goto L_0x005a
            X.MeU r0 = X.C41228M0s.A01
            boolean r0 = r0.BZ9()
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = "Bloks cacheTraversal: "
            int r0 = r3.A03
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            X.C41228M0s.A01(r0)
        L_0x004b:
            r2 = 1
            com.facebook.redex.IDxVisitorShape319S0200000_2_I2 r1 = new com.facebook.redex.IDxVisitorShape319S0200000_2_I2
            r0 = r18
            r1.<init>(r2, r0, r3)
            r3.A0U(r1)
        L_0x0056:
            X.C41228M0s.A00()
            return r4
        L_0x005a:
            X.MeU r0 = X.C41228M0s.A01
            boolean r0 = r0.BZ9()
            if (r0 == 0) goto L_0x0082
            r1 = 128(0x80, float:1.794E-43)
            android.util.SparseArray r0 = r3.A04
            java.lang.String r2 = X.C86114wI.A0m(r0, r1)
            java.lang.String r1 = "Bloks Layout: "
            int r0 = r3.A03
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
            X.MeU r0 = X.C41228M0s.A01
            X.Mcn r1 = r0.AAE(r1)
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = "bloks_debug_metadata"
            r1.A9F(r2, r0)
        L_0x007f:
            r1.flush()
        L_0x0082:
            java.lang.Object r0 = r7.A05
            r17 = r0
            r1 = r0
            X.3HX r1 = (X.AnonymousClass3HX) r1
            r1.getClass()
            boolean r0 = X.AnonymousClass7K7.A07(r1)
            if (r0 == 0) goto L_0x009c
            int r2 = r3.A03
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r2 == r0) goto L_0x0764
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r2 == r0) goto L_0x0764
        L_0x009c:
            X.AnonymousClass794.A00()
            int r0 = r3.A03
            boolean r16 = X.C122117Ki.A0C(r0)
            if (r16 == 0) goto L_0x0753
            r2 = 13317(0x3405, float:1.8661E-41)
            if (r0 != r2) goto L_0x054f
            java.lang.Object r5 = X.AnonymousClass7K7.A04(r1, r3)
            X.7qj r5 = (X.C130767qj) r5
            int r21 = X.C101066Pt.A00(r3)
            int r2 = r3.A02
            long r10 = (long) r2
            X.5fZ r14 = r5.A02
            android.content.Context r2 = r1.A00
            r34 = r2
            r6 = 1
            r2 = 0
            r4 = r34
            X.C04220Ms.A0B(r4, r6)
            java.lang.Integer r4 = X.AnonymousClass70F.A01(r3)
            int r12 = r4.intValue()
            if (r12 == r2) goto L_0x013e
            X.77H r13 = X.AnonymousClass77H.A00
            r4 = r34
            X.6mC r4 = r13.A00(r4, r3)
            if (r12 == r6) goto L_0x0102
            int r12 = r4.A01
            int r4 = r4.A02
            X.5fW r13 = new X.5fW
            r13.<init>(r12, r4)
        L_0x00e2:
            X.5fO r4 = new X.5fO
            r4.<init>(r13, r14, r10)
            X.6cK r10 = r5.A01
            r4.A07 = r10
            r10 = 67
            java.lang.Object r10 = A0A(r3, r10)
            boolean r10 = X.AnonymousClass2LL.A00(r10, r2)
            if (r10 == 0) goto L_0x02d0
            r10 = 71
            android.util.SparseArray r13 = r3.A04
            java.lang.String r12 = X.C86114wI.A0m(r13, r10)
            r11 = 1082130432(0x40800000, float:4.0)
            goto L_0x0152
        L_0x0102:
            java.util.List r13 = r3.A0P()
            X.C04220Ms.A06(r13)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0w(r13)
            java.util.Iterator r19 = r13.iterator()
        L_0x0111:
            boolean r13 = r19.hasNext()
            if (r13 == 0) goto L_0x012f
            X.7h3 r15 = X.C86144wL.A0V(r19)
            X.C04220Ms.A04(r15)
            boolean r13 = X.AnonymousClass70G.A01(r15)
            if (r13 == 0) goto L_0x012a
            int r13 = r4.A02
        L_0x0126:
            X.C18200wM.A1U(r12, r13)
            goto L_0x0111
        L_0x012a:
            int r13 = X.AnonymousClass70G.A00(r15)
            goto L_0x0126
        L_0x012f:
            androidx.recyclerview.widget.IDxSLookupShape43S0100000_2_I2 r15 = new androidx.recyclerview.widget.IDxSLookupShape43S0100000_2_I2
            r15.<init>(r12, r6)
            int r12 = r4.A01
            int r4 = r4.A02
            X.5fX r13 = new X.5fX
            r13.<init>(r15, r12, r4)
            goto L_0x00e2
        L_0x013e:
            int r12 = X.C101116Py.A00(r3)
            r4 = 73
            java.lang.Object r4 = A0A(r3, r4)
            boolean r4 = X.AnonymousClass2LL.A00(r4, r2)
            X.5fV r13 = new X.5fV
            r13.<init>(r12, r4)
            goto L_0x00e2
        L_0x0152:
            android.util.DisplayMetrics r10 = X.C18230wP.A0E(r34)     // Catch:{ 1zB -> 0x324c }
            float r10 = r10.density     // Catch:{ 1zB -> 0x324c }
            float r10 = r10 * r11
            if (r12 == 0) goto L_0x015f
            float r10 = X.AnonymousClass7Kk.A01(r12)     // Catch:{ 1zB -> 0x324c }
        L_0x015f:
            int r10 = (int) r10
            r32 = r10
            r10 = 70
            X.7h3 r10 = r3.A0K(r10)
            if (r10 == 0) goto L_0x0191
            int r23 = X.C101086Pv.A00(r1, r10, r2)
        L_0x016e:
            r10 = 78
            X.7h3 r10 = r3.A0K(r10)
            if (r10 == 0) goto L_0x018e
            int r22 = X.C101086Pv.A00(r1, r10, r2)
        L_0x017a:
            r10 = 68
            java.lang.Object r10 = A0A(r3, r10)
            boolean r20 = X.AnonymousClass2LL.A00(r10, r2)
            r10 = 72
            java.lang.String r11 = X.C86114wI.A0m(r13, r10)
            r10 = 0
            if (r11 == 0) goto L_0x0199
            goto L_0x0195
        L_0x018e:
            r22 = 0
            goto L_0x017a
        L_0x0191:
            r23 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x016e
        L_0x0195:
            float r10 = X.AnonymousClass7Kk.A01(r11)     // Catch:{ 1zB -> 0x321d }
        L_0x0199:
            int r10 = (int) r10
            r31 = r10
            X.5AK r10 = r5.A06
            r19 = 87
            r11 = r19
            X.7h3 r12 = r3.A0K(r11)
            if (r12 == 0) goto L_0x0207
            r11 = 42
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r15 = (int) r11
            r11 = 40
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r11 = (int) r11
            r27 = r11
            r11 = 41
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r14 = (int) r11
            r11 = 35
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r11 = (int) r11
            r26 = r11
            r11 = 36
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r11 = (int) r11
            r25 = r11
            r11 = 38
            float r11 = X.AnonymousClass6Q2.A00(r12, r11)
            int r11 = (int) r11
            if (r15 != 0) goto L_0x01dc
            r15 = r25
        L_0x01dc:
            if (r14 != 0) goto L_0x01df
            r14 = r11
        L_0x01df:
            r12 = r27
            r11 = r26
            android.graphics.Rect r12 = X.C86164wN.A0F(r15, r12, r14, r11)
        L_0x01e7:
            r11 = 81
            X.7h3 r11 = r3.A0K(r11)
            if (r11 != 0) goto L_0x01f9
            r11 = r19
            X.7h3 r11 = r3.A0K(r11)
            r19 = 0
            if (r11 == 0) goto L_0x01fb
        L_0x01f9:
            r19 = 1
        L_0x01fb:
            r11 = 90
            java.lang.String r14 = X.C86114wI.A0m(r13, r11)
            r11 = 0
            r26 = 0
            if (r14 == 0) goto L_0x0218
            goto L_0x0214
        L_0x0207:
            r11 = 76
            float r11 = A00(r3, r11)     // Catch:{ 1zB -> 0x3245 }
            int r11 = (int) r11
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>(r11, r11, r11, r11)
            goto L_0x01e7
        L_0x0214:
            float r26 = X.AnonymousClass7Kk.A01(r14)     // Catch:{ 1zB -> 0x3224 }
        L_0x0218:
            r14 = 89
            java.lang.String r14 = X.C86114wI.A0m(r13, r14)
            r27 = 0
            if (r14 == 0) goto L_0x0226
            float r27 = X.AnonymousClass7Kk.A01(r14)     // Catch:{ 1zB -> 0x322f }
        L_0x0226:
            r14 = 93
            java.lang.String r13 = X.C86114wI.A0m(r13, r14)
            if (r13 == 0) goto L_0x0236
            float r29 = X.AnonymousClass7Kk.A01(r13)     // Catch:{ 1zB -> 0x323a }
            int r13 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0238
        L_0x0236:
            r29 = 1056964608(0x3f000000, float:0.5)
        L_0x0238:
            r13 = 91
            float r28 = r3.A0G(r13, r11)
            int r11 = (r28 > r11 ? 1 : (r28 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x3273
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r28 > r11 ? 1 : (r28 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x3273
            r11 = 88
            X.7h3 r11 = r3.A0K(r11)
            if (r11 == 0) goto L_0x0373
            int r30 = X.C101086Pv.A00(r1, r11, r2)
        L_0x0254:
            X.6lw r11 = new X.6lw
            r25 = r11
            r25.<init>(r26, r27, r28, r29, r30)
            if (r10 == 0) goto L_0x035a
            int r14 = r10.A04
            r13 = r23
            if (r14 != r13) goto L_0x035a
            int r14 = r10.A03
            r13 = r22
            if (r14 != r13) goto L_0x035a
            int r14 = r10.A06
            r13 = r32
            if (r14 != r13) goto L_0x035a
            int r14 = r10.A05
            r13 = r31
            if (r14 != r13) goto L_0x035a
            boolean r14 = r10.A09
            r13 = r20
            if (r14 != r13) goto L_0x035a
            android.graphics.Rect r13 = r10.A07
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x035a
            boolean r14 = r10.A0A
            r13 = r19
            if (r14 != r13) goto L_0x035a
            X.6lw r15 = r10.A08
            float r14 = r15.A01
            float r13 = r11.A01
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x035a
            float r14 = r15.A00
            float r13 = r11.A00
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x035a
            float r14 = r15.A02
            float r13 = r11.A02
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x035a
            float r14 = r15.A03
            float r13 = r11.A03
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x035a
            int r14 = r15.A04
            int r13 = r11.A04
            if (r14 != r13) goto L_0x035a
        L_0x02b1:
            r11 = 77
            java.lang.Object r11 = A0A(r3, r11)
            boolean r12 = X.AnonymousClass2LL.A00(r11, r2)
            X.5AU r11 = new X.5AU
            r11.<init>(r10, r12)
            r4.A0O(r11)
            java.util.List r11 = r4.A08
            if (r11 != 0) goto L_0x02cd
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            r4.A08 = r11
        L_0x02cd:
            r11.add(r10)
        L_0x02d0:
            r10 = 50
            X.6jp r11 = r3.A0L(r10)
            if (r11 == 0) goto L_0x02e0
            X.11f r10 = new X.11f
            r10.<init>(r1, r3, r11)
            r4.A0O(r10)
        L_0x02e0:
            r10 = 61
            X.6jp r11 = r3.A0L(r10)
            if (r11 == 0) goto L_0x02f0
            X.11e r10 = new X.11e
            r10.<init>(r1, r3, r11)
            r4.A0O(r10)
        L_0x02f0:
            r10 = 49
            X.6jp r10 = r3.A0L(r10)
            if (r10 == 0) goto L_0x0305
            X.6ph r11 = new X.6ph
            r11.<init>(r1, r3, r10)
            X.5AV r10 = new X.5AV
            r10.<init>(r11)
            r4.A0O(r10)
        L_0x0305:
            r10 = 54
            android.util.SparseArray r11 = r3.A04
            java.lang.String r12 = X.C86114wI.A0m(r11, r10)
            if (r12 != 0) goto L_0x0320
            java.lang.Integer r15 = X.AnonymousClass006.A0N
        L_0x0311:
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            if (r15 == r10) goto L_0x042e
            java.lang.Integer r19 = X.AnonymousClass006.A01
            r10 = 69
            java.lang.String r12 = X.C86114wI.A0m(r11, r10)
            if (r12 == 0) goto L_0x0390
            goto L_0x0377
        L_0x0320:
            int r10 = r12.hashCode()     // Catch:{ 1zB -> 0x326c }
            switch(r10) {
                case -1364013995: goto L_0x032e;
                case 100571: goto L_0x0339;
                case 3387192: goto L_0x0344;
                case 109757538: goto L_0x034f;
                default: goto L_0x0327;
            }     // Catch:{ 1zB -> 0x326c }
        L_0x0327:
            java.lang.String r0 = "can't parse unknown snap gravity: "
            X.1zB r0 = X.C86124wJ.A0c(r0, r12)     // Catch:{ 1zB -> 0x326c }
            throw r0     // Catch:{ 1zB -> 0x326c }
        L_0x032e:
            java.lang.String r10 = "center"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x326c }
            if (r10 == 0) goto L_0x0327
            java.lang.Integer r15 = X.AnonymousClass006.A01     // Catch:{ 1zB -> 0x326c }
            goto L_0x0311
        L_0x0339:
            java.lang.String r10 = "end"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x326c }
            if (r10 == 0) goto L_0x0327
            java.lang.Integer r15 = X.AnonymousClass006.A0C     // Catch:{ 1zB -> 0x326c }
            goto L_0x0311
        L_0x0344:
            java.lang.String r10 = "none"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x326c }
            if (r10 == 0) goto L_0x0327
            java.lang.Integer r15 = X.AnonymousClass006.A0N     // Catch:{ 1zB -> 0x326c }
            goto L_0x0311
        L_0x034f:
            java.lang.String r10 = "start"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x326c }
            if (r10 == 0) goto L_0x0327
            java.lang.Integer r15 = X.AnonymousClass006.A00     // Catch:{ 1zB -> 0x326c }
            goto L_0x0311
        L_0x035a:
            X.5AK r10 = new X.5AK
            r25 = r10
            r26 = r12
            r27 = r11
            r28 = r23
            r29 = r22
            r30 = r32
            r32 = r20
            r33 = r19
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r5.A06 = r10
            goto L_0x02b1
        L_0x0373:
            r30 = 0
            goto L_0x0254
        L_0x0377:
            java.lang.String r10 = "linear"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x3253 }
            if (r10 != 0) goto L_0x038e
            java.lang.String r10 = "pager"
            boolean r10 = r12.equals(r10)     // Catch:{ 1zB -> 0x3253 }
            if (r10 != 0) goto L_0x0390
            java.lang.String r0 = "can't parse unknown snap style: "
            X.1zB r0 = X.C86124wJ.A0c(r0, r12)     // Catch:{ 1zB -> 0x3253 }
            throw r0     // Catch:{ 1zB -> 0x3253 }
        L_0x038e:
            java.lang.Integer r19 = X.AnonymousClass006.A00     // Catch:{ 1zB -> 0x3253 }
        L_0x0390:
            r10 = 45
            java.lang.String r12 = X.C86114wI.A0m(r11, r10)
            r10 = 0
            if (r12 == 0) goto L_0x039d
            float r10 = X.AnonymousClass7Kk.A01(r12)     // Catch:{ 1zB -> 0x325a }
        L_0x039d:
            java.lang.Float r14 = java.lang.Float.valueOf(r10)
            X.F7x r13 = r5.A05
            int r10 = r19.intValue()
            java.lang.String r20 = "Invalid gravity type :"
            r19 = 2
            int r12 = r15.intValue()
            if (r10 == r2) goto L_0x03e4
            if (r12 == r2) goto L_0x03c8
            r10 = r19
            if (r12 == r10) goto L_0x03c8
            if (r12 == r6) goto L_0x03c8
            java.lang.String r1 = X.AnonymousClass6QC.A00(r15)
            r0 = r20
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x03c8:
            boolean r10 = r13 instanceof X.C39958LAw
            if (r10 == 0) goto L_0x03de
            r10 = r13
            X.LAw r10 = (X.C39958LAw) r10
            X.M1d r12 = r10.A00
            java.lang.Integer r10 = r12.A03
            if (r10 != r15) goto L_0x03de
            java.lang.Float r10 = r12.A02
            boolean r10 = X.C100986Pl.A00(r10, r14)
            if (r10 == 0) goto L_0x03de
            goto L_0x0410
        L_0x03de:
            X.LAw r13 = new X.LAw
            r13.<init>(r14, r15)
            goto L_0x0410
        L_0x03e4:
            if (r12 == r2) goto L_0x03fb
            r10 = r19
            if (r12 == r10) goto L_0x03fb
            if (r12 == r6) goto L_0x03fb
            java.lang.String r1 = X.AnonymousClass6QC.A00(r15)
            r0 = r20
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x03fb:
            boolean r10 = r13 instanceof X.LAt
            if (r10 == 0) goto L_0x0541
            r10 = r13
            X.LAt r10 = (X.LAt) r10
            X.M1d r12 = r10.A00
            java.lang.Integer r10 = r12.A03
            if (r10 != r15) goto L_0x0541
            java.lang.Float r10 = r12.A02
            boolean r10 = X.C100986Pl.A00(r10, r14)
            if (r10 == 0) goto L_0x0541
        L_0x0410:
            r4.A06 = r13
            r5.A05 = r13
            r5.A07 = r15
            r10 = 51
            X.6jp r12 = r3.A0L(r10)
            r10 = 97
            X.6jp r10 = r3.A0L(r10)
            if (r12 != 0) goto L_0x0426
            if (r10 == 0) goto L_0x042e
        L_0x0426:
            X.5AW r10 = new X.5AW
            r10.<init>(r13, r1, r3)
            r4.A0O(r10)
        L_0x042e:
            java.lang.Integer r10 = X.AnonymousClass70F.A01(r3)
            int r10 = r10.intValue()
            if (r10 == r2) goto L_0x0454
            X.77H r12 = X.AnonymousClass77H.A00
            r10 = r34
            X.6mC r10 = r12.A00(r10, r3)
            android.graphics.Rect r12 = r10.A04
            int r10 = r12.left
            if (r10 != 0) goto L_0x0452
            int r10 = r12.top
            if (r10 != 0) goto L_0x0452
            int r10 = r12.right
            if (r10 != 0) goto L_0x0452
            int r10 = r12.bottom
            if (r10 == 0) goto L_0x0454
        L_0x0452:
            r4.A04 = r12
        L_0x0454:
            java.lang.Integer r10 = X.AnonymousClass70F.A01(r3)
            int r10 = r10.intValue()
            if (r10 == r2) goto L_0x04b8
            if (r10 == r6) goto L_0x04b2
            X.5AH r10 = new X.5AH
            r10.<init>(r1, r3)
        L_0x0465:
            java.util.List r12 = r4.A08
            if (r12 != 0) goto L_0x046f
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            r4.A08 = r12
        L_0x046f:
            r12.add(r10)
        L_0x0472:
            r10 = 43
            java.lang.Object r10 = A0A(r3, r10)
            boolean r10 = X.AnonymousClass2LL.A00(r10, r2)
            if (r10 == 0) goto L_0x048a
            X.IA1 r10 = r5.A04
            if (r10 == 0) goto L_0x04ac
            X.IA1 r10 = r5.A04
        L_0x0484:
            r5.A04 = r10
            r10.A00 = r2
            r4.A05 = r10
        L_0x048a:
            r10 = 35
            java.lang.Object r10 = A0A(r3, r10)
            boolean r12 = X.AnonymousClass2LL.A00(r10, r2)
            r10 = 2
            if (r12 == 0) goto L_0x0498
            r10 = 0
        L_0x0498:
            r4.A02 = r10
            r10 = 41
            X.7h3 r10 = r3.A0K(r10)
            if (r10 == 0) goto L_0x04a8
            int r10 = X.C101086Pv.A00(r1, r10, r2)
            r4.A00 = r10
        L_0x04a8:
            r10 = 75
            goto L_0x0548
        L_0x04ac:
            X.IA1 r10 = new X.IA1
            r10.<init>()
            goto L_0x0484
        L_0x04b2:
            X.5AG r10 = new X.5AG
            r10.<init>(r1, r3)
            goto L_0x0465
        L_0x04b8:
            r10 = 55
            java.lang.String r10 = X.C86114wI.A0m(r11, r10)     // Catch:{ 1zB -> 0x3265 }
            r20 = 0
            r29 = 0
            if (r10 == 0) goto L_0x04c8
            float r29 = X.AnonymousClass7Kk.A01(r10)     // Catch:{ 1zB -> 0x3265 }
        L_0x04c8:
            r10 = 56
            float r27 = A00(r3, r10)     // Catch:{ 1zB -> 0x3265 }
            r10 = 44
            float r28 = A00(r3, r10)     // Catch:{ 1zB -> 0x3265 }
            r10 = 100
            java.lang.String r12 = X.C86114wI.A0m(r11, r10)     // Catch:{ 1zB -> 0x3265 }
            X.684 r10 = X.AnonymousClass684.STRETCH     // Catch:{ 1zB -> 0x3265 }
            X.684 r12 = X.AnonymousClass70F.A00(r10, r12)     // Catch:{ 1zB -> 0x3265 }
            r19 = 0
            if (r12 != r10) goto L_0x0520
            java.util.List r14 = r3.A0P()     // Catch:{ 1zB -> 0x3265 }
            X.C04220Ms.A06(r14)     // Catch:{ 1zB -> 0x3265 }
            boolean r13 = r14 instanceof java.util.Collection     // Catch:{ 1zB -> 0x3265 }
            if (r13 == 0) goto L_0x04f6
            boolean r13 = r14.isEmpty()     // Catch:{ 1zB -> 0x3265 }
            if (r13 == 0) goto L_0x04f6
            goto L_0x0530
        L_0x04f6:
            java.util.Iterator r15 = r14.iterator()     // Catch:{ 1zB -> 0x3265 }
            r14 = 0
        L_0x04fb:
            boolean r13 = r15.hasNext()     // Catch:{ 1zB -> 0x3265 }
            if (r13 == 0) goto L_0x051e
            X.7h3 r13 = X.C86144wL.A0V(r15)     // Catch:{ 1zB -> 0x3265 }
            X.7h3 r13 = A06(r13)     // Catch:{ 1zB -> 0x3265 }
            if (r13 == 0) goto L_0x051b
            java.lang.String r13 = A0E(r13)     // Catch:{ 1zB -> 0x3265 }
        L_0x050f:
            X.684 r13 = X.AnonymousClass70F.A00(r12, r13)     // Catch:{ 1zB -> 0x3265 }
            if (r13 == r10) goto L_0x04fb
            int r14 = r14 + 1
            if (r14 >= 0) goto L_0x04fb
            goto L_0x3261
        L_0x051b:
            r13 = r19
            goto L_0x050f
        L_0x051e:
            if (r14 == 0) goto L_0x0530
        L_0x0520:
            r13 = 1
        L_0x0521:
            int r10 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x0532
            int r10 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x0532
            int r10 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x0532
            if (r13 == 0) goto L_0x0472
            goto L_0x0532
        L_0x0530:
            r13 = 0
            goto L_0x0521
        L_0x0532:
            int r30 = X.C101116Py.A00(r3)     // Catch:{ 1zB -> 0x3265 }
            X.5AM r10 = new X.5AM     // Catch:{ 1zB -> 0x3265 }
            r25 = r10
            r26 = r12
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ 1zB -> 0x3265 }
            goto L_0x0465
        L_0x0541:
            X.LAt r13 = new X.LAt
            r13.<init>(r14, r15)
            goto L_0x0410
        L_0x0548:
            float r2 = A00(r3, r10)     // Catch:{ 1zB -> 0x2fe3 }
            int r2 = (int) r2     // Catch:{ 1zB -> 0x2fe3 }
            goto L_0x2feb
        L_0x054f:
            r2 = 13320(0x3408, float:1.8665E-41)
            if (r0 != r2) goto L_0x078c
            r2 = 38
            X.7h3 r10 = r3.A0K(r2)     // Catch:{ IOException -> 0x327a }
            r4 = 2131297451(0x7f0904ab, float:1.8212847E38)
            android.util.SparseArray r2 = r1.A01     // Catch:{ IOException -> 0x327a }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IOException -> 0x327a }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IOException -> 0x327a }
            if (r2 != 0) goto L_0x0567
            goto L_0x056c
        L_0x0567:
            boolean r6 = r2.booleanValue()     // Catch:{ IOException -> 0x327a }
            goto L_0x056d
        L_0x056c:
            r6 = 1
        L_0x056d:
            if (r10 == 0) goto L_0x0579
            r2 = 43
            java.lang.Object r2 = A0A(r10, r2)     // Catch:{ IOException -> 0x327a }
            boolean r6 = X.AnonymousClass2LL.A00(r2, r6)     // Catch:{ IOException -> 0x327a }
        L_0x0579:
            r11 = 49
            android.util.SparseArray r2 = r3.A04     // Catch:{ IOException -> 0x327a }
            java.lang.String r4 = X.C86114wI.A0m(r2, r11)     // Catch:{ IOException -> 0x327a }
            if (r4 == 0) goto L_0x05b6
            int r2 = r4.hashCode()     // Catch:{ IOException -> 0x327a }
            r5 = 0
            switch(r2) {
                case -1901805651: goto L_0x05a8;
                case 3178655: goto L_0x059f;
                case 466743410: goto L_0x0592;
                default: goto L_0x058b;
            }     // Catch:{ IOException -> 0x327a }
        L_0x058b:
            java.lang.String r0 = "unknown visibility "
            X.1zB r0 = X.C86124wJ.A0c(r0, r4)     // Catch:{ IOException -> 0x327a }
            throw r0     // Catch:{ IOException -> 0x327a }
        L_0x0592:
            java.lang.String r2 = "visible"
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x327a }
            if (r2 == 0) goto L_0x058b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x327a }
            goto L_0x05bc
        L_0x059f:
            java.lang.String r2 = "gone"
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x327a }
            if (r2 == 0) goto L_0x058b
            goto L_0x05b1
        L_0x05a8:
            java.lang.String r2 = "invisible"
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x327a }
            if (r2 == 0) goto L_0x058b
            goto L_0x05b4
        L_0x05b1:
            r2 = 8
            goto L_0x05b8
        L_0x05b4:
            r2 = 4
            goto L_0x05b8
        L_0x05b6:
            r2 = 0
            goto L_0x05cd
        L_0x05b8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x327a }
        L_0x05bc:
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x327a }
            r12 = 4
            if (r2 != r12) goto L_0x05b6
            int r2 = r3.A02     // Catch:{ IOException -> 0x327a }
            long r4 = (long) r2     // Catch:{ IOException -> 0x327a }
            X.5fM r2 = new X.5fM     // Catch:{ IOException -> 0x327a }
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x327a }
            r2.A02 = r12     // Catch:{ IOException -> 0x327a }
        L_0x05cd:
            r4 = 40
            r5 = 1
            java.lang.Object r4 = A0A(r3, r4)     // Catch:{ IOException -> 0x327a }
            boolean r4 = X.AnonymousClass2LL.A00(r4, r5)     // Catch:{ IOException -> 0x327a }
            if (r4 != 0) goto L_0x05e7
            if (r2 != 0) goto L_0x05e4
            int r2 = r3.A02     // Catch:{ IOException -> 0x327a }
            long r4 = (long) r2     // Catch:{ IOException -> 0x327a }
            X.5fM r2 = new X.5fM     // Catch:{ IOException -> 0x327a }
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x327a }
        L_0x05e4:
            r4 = 0
            r2.A09 = r4     // Catch:{ IOException -> 0x327a }
        L_0x05e7:
            r4 = 45
            X.6jp r12 = r3.A0L(r4)     // Catch:{ IOException -> 0x327a }
            if (r12 == 0) goto L_0x0602
            if (r2 != 0) goto L_0x05f9
            int r2 = r3.A02     // Catch:{ IOException -> 0x327a }
            long r4 = (long) r2     // Catch:{ IOException -> 0x327a }
            X.5fM r2 = new X.5fM     // Catch:{ IOException -> 0x327a }
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x327a }
        L_0x05f9:
            r5 = 18
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2     // Catch:{ IOException -> 0x327a }
            r4.<init>((X.AnonymousClass3HX) r1, (X.C127397h3) r3, (X.C109326jp) r12, (int) r5)     // Catch:{ IOException -> 0x327a }
            r2.A06 = r4     // Catch:{ IOException -> 0x327a }
        L_0x0602:
            if (r10 == 0) goto L_0x06a6
            if (r2 != 0) goto L_0x060e
            int r2 = r3.A02     // Catch:{ IOException -> 0x327a }
            long r4 = (long) r2     // Catch:{ IOException -> 0x327a }
            X.5fM r2 = new X.5fM     // Catch:{ IOException -> 0x327a }
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x327a }
        L_0x060e:
            r2.A07 = r10     // Catch:{ IOException -> 0x327a }
            X.7h3 r14 = A05(r10)     // Catch:{ IOException -> 0x327a }
            X.3HX r13 = r2.A0A     // Catch:{ IOException -> 0x327a }
            r13.getClass()     // Catch:{ IOException -> 0x327a }
            r12 = 0
            r10 = 0
            if (r14 == 0) goto L_0x061e
            goto L_0x0622
        L_0x061e:
            r4 = r12
            r19 = 0
            goto L_0x0638
        L_0x0622:
            X.794 r4 = X.AnonymousClass794.A00()     // Catch:{ IOException -> 0x327a }
            X.6r7 r5 = r4.A07     // Catch:{ IOException -> 0x327a }
            X.7h3 r4 = r2.A07     // Catch:{ IOException -> 0x327a }
            android.graphics.drawable.Drawable r4 = r5.A00(r13, r14, r4)     // Catch:{ IOException -> 0x327a }
            X.794 r5 = X.AnonymousClass794.A00()     // Catch:{ IOException -> 0x327a }
            X.6r7 r5 = r5.A07     // Catch:{ IOException -> 0x327a }
            boolean r19 = r5.A01(r14)     // Catch:{ IOException -> 0x327a }
        L_0x0638:
            X.7h3 r5 = r2.A07     // Catch:{ IOException -> 0x327a }
            X.7h3 r11 = r5.A0K(r11)     // Catch:{ IOException -> 0x327a }
            if (r11 == 0) goto L_0x0658
            X.794 r5 = X.AnonymousClass794.A00()     // Catch:{ IOException -> 0x327a }
            X.6r7 r12 = r5.A07     // Catch:{ IOException -> 0x327a }
            X.7h3 r5 = r2.A07     // Catch:{ IOException -> 0x327a }
            android.graphics.drawable.Drawable r12 = r12.A00(r13, r11, r5)     // Catch:{ IOException -> 0x327a }
            X.794 r5 = X.AnonymousClass794.A00()     // Catch:{ IOException -> 0x327a }
            X.6r7 r5 = r5.A07     // Catch:{ IOException -> 0x327a }
            boolean r5 = r5.A01(r11)     // Catch:{ IOException -> 0x327a }
            r19 = r19 | r5
        L_0x0658:
            if (r4 != 0) goto L_0x069d
            X.7h3 r11 = r2.A07     // Catch:{ 1zB -> 0x0697 }
            r5 = 43
            java.lang.Object r5 = A0A(r11, r5)     // Catch:{ 1zB -> 0x0697 }
            boolean r5 = X.AnonymousClass2LL.A00(r5, r10)     // Catch:{ 1zB -> 0x0697 }
            r15 = 1
            boolean r14 = X.C18180wK.A1W(r5)
            X.7h3 r5 = r2.A07     // Catch:{ 1zB -> 0x0697 }
            r11 = 46
            android.util.SparseArray r5 = r5.A04     // Catch:{ 1zB -> 0x0697 }
            java.lang.String r5 = X.C86114wI.A0m(r5, r11)     // Catch:{ 1zB -> 0x0697 }
            r11 = 0
            if (r5 == 0) goto L_0x0681
            float r5 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x0697 }
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0681
            r15 = 0
        L_0x0681:
            if (r14 != 0) goto L_0x0685
            if (r15 == 0) goto L_0x069d
        L_0x0685:
            X.7h3 r11 = r2.A07     // Catch:{ 1zB -> 0x0697 }
            r5 = 40
            float r5 = A00(r11, r5)     // Catch:{ 1zB -> 0x0697 }
            int r5 = (int) r5     // Catch:{ 1zB -> 0x0697 }
            if (r5 == 0) goto L_0x069d
            X.7h3 r5 = r2.A07     // Catch:{ 1zB -> 0x0697 }
            X.4xf r4 = X.C120507Be.A01(r13, r5, r10)     // Catch:{ 1zB -> 0x0697 }
            goto L_0x069d
        L_0x0697:
            r10 = move-exception
            java.lang.String r5 = "HostWithDecoratorRenderUnit"
            X.C30967GcS.A03(r5, r10)     // Catch:{ IOException -> 0x327a }
        L_0x069d:
            r2.A04 = r4     // Catch:{ IOException -> 0x327a }
            r2.A05 = r12     // Catch:{ IOException -> 0x327a }
            if (r19 == 0) goto L_0x06a6
            r4 = 2
            r2.A01 = r4     // Catch:{ IOException -> 0x327a }
        L_0x06a6:
            java.util.List r14 = r3.A0P()     // Catch:{ IOException -> 0x327a }
            r12 = 0
            r13 = 0
        L_0x06ac:
            int r4 = r14.size()     // Catch:{ IOException -> 0x327a }
            if (r13 >= r4) goto L_0x073e
            X.7h3 r5 = X.C86154wM.A0Q(r14, r13)     // Catch:{ IOException -> 0x327a }
            X.7h3 r11 = A06(r5)     // Catch:{ IOException -> 0x327a }
            if (r11 == 0) goto L_0x073a
            int r10 = r11.A03     // Catch:{ IOException -> 0x327a }
            r4 = 13368(0x3438, float:1.8733E-41)
            if (r10 != r4) goto L_0x073a
            r4 = 75
            X.7h3 r11 = r11.A0K(r4)     // Catch:{ IOException -> 0x327a }
            if (r11 == 0) goto L_0x073a
            if (r12 != 0) goto L_0x06d0
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ IOException -> 0x327a }
        L_0x06d0:
            X.6mX r10 = new X.6mX     // Catch:{ IOException -> 0x327a }
            r10.<init>()     // Catch:{ IOException -> 0x327a }
            int r4 = r5.A02     // Catch:{ IOException -> 0x327a }
            r10.A06 = r4     // Catch:{ IOException -> 0x327a }
            r5 = 42
            android.util.SparseArray r4 = r11.A04     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = X.C86114wI.A0m(r4, r5)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x06e8
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x06e8:
            r10.A05 = r4     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = X.C18220wO.A0o(r11)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x06f5
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x06f5:
            r10.A00 = r4     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = A0D(r11)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x0702
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x0702:
            r10.A04 = r4     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = X.C18230wP.A0o(r11)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x070f
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x070f:
            r10.A01 = r4     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = A0B(r11)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x071c
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x071c:
            r10.A02 = r4     // Catch:{ 1zB -> 0x072c }
            java.lang.String r5 = A0C(r11)     // Catch:{ 1zB -> 0x072c }
            r4 = 1
            if (r5 == 0) goto L_0x0729
            float r4 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x072c }
        L_0x0729:
            r10.A03 = r4     // Catch:{ 1zB -> 0x072c }
            goto L_0x0737
        L_0x072c:
            r11 = move-exception
            java.lang.String r5 = "FlexboxBinderUtils"
            java.lang.String r4 = "Error parsing touch expansion property"
            X.C30967GcS.A02(r5, r4)     // Catch:{ IOException -> 0x327a }
            r11.printStackTrace()     // Catch:{ IOException -> 0x327a }
        L_0x0737:
            r12.add(r10)     // Catch:{ IOException -> 0x327a }
        L_0x073a:
            int r13 = r13 + 1
            goto L_0x06ac
        L_0x073e:
            if (r12 == 0) goto L_0x0795
            if (r2 != 0) goto L_0x074a
            int r2 = r3.A02     // Catch:{ IOException -> 0x327a }
            long r4 = (long) r2     // Catch:{ IOException -> 0x327a }
            X.5fM r2 = new X.5fM     // Catch:{ IOException -> 0x327a }
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x327a }
        L_0x074a:
            X.MH0 r4 = new X.MH0     // Catch:{ IOException -> 0x327a }
            r4.<init>(r12)     // Catch:{ IOException -> 0x327a }
            X.C86134wK.A1I(r4, r2, r12)     // Catch:{ IOException -> 0x327a }
            goto L_0x0795
        L_0x0753:
            java.lang.Object[] r4 = X.C18210wN.A1X(r0)
            java.lang.String r2 = "Attempting to createRenderUnit for unrecognized component style id %s"
            java.lang.String r4 = java.lang.String.format(r2, r4)
            java.lang.String r2 = "ComponentMapper"
            X.C30967GcS.A02(r2, r4)
            goto L_0x2b17
        L_0x0764:
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.Object r0 = A0A(r3, r0)
            r0.getClass()
            X.8gn r0 = (X.C143468gn) r0
            X.MeD r4 = r0.ABY(r7, r8, r9)
            X.M5L r2 = r4.B6z()
            if (r2 == 0) goto L_0x078a
            X.LLM r0 = new X.LLM
            r0.<init>(r2)
        L_0x077e:
            X.M5L r1 = r3.A04(r0, r1)
            if (r1 == r2) goto L_0x07bc
            X.MGs r0 = new X.MGs
            r0.<init>(r4, r1)
            goto L_0x07bb
        L_0x078a:
            r0 = r2
            goto L_0x077e
        L_0x078c:
            r2 = 13326(0x340e, float:1.8674E-41)
            if (r0 != r2) goto L_0x2a96
            X.5zR r2 = new X.5zR
            r2.<init>(r1, r3)
        L_0x0795:
            X.M5L r2 = r3.A04(r2, r1)
            X.AnonymousClass794.A00()
            if (r16 == 0) goto L_0x2a64
            r4 = 13317(0x3405, float:1.8661E-41)
            if (r0 != r4) goto L_0x110a
            r6 = 0
            r24 = 2
            r0 = 1
            r4 = r24
            X.C04220Ms.A0B(r2, r4)
            java.lang.Integer r4 = X.AnonymousClass70F.A01(r3)
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0cad
            if (r4 == r0) goto L_0x07ca
            X.MeD r0 = X.C101126Pz.A00(r7, r2, r3, r8, r9)
        L_0x07bb:
            r4 = r0
        L_0x07bc:
            X.AnonymousClass794.A00()
            r0 = r18
            X.LmH r0 = r0.A01
            java.util.Map r0 = r0.A01
            r0.put(r3, r4)
            goto L_0x0056
        L_0x07ca:
            X.77H r5 = X.AnonymousClass77H.A00
            android.content.Context r4 = r7.A04
            r47 = r4
            X.C04220Ms.A06(r47)
            X.6mC r5 = r5.A00(r4, r3)
            int r6 = r5.A01
            int r4 = r5.A02
            r45 = r4
            int r4 = r5.A00
            r44 = r4
            int r4 = r5.A03
            r43 = r4
            android.graphics.Rect r4 = r5.A04
            r54 = r4
            X.7h3 r5 = r5.A05
            r4 = 35
            java.lang.Object r42 = A0A(r5, r4)
            r4 = r42
            boolean r4 = r4 instanceof java.lang.Number
            r41 = 0
            if (r4 == 0) goto L_0x0852
            r4 = r42
            java.lang.Number r4 = (java.lang.Number) r4
            r42 = r4
        L_0x07ff:
            java.util.List r13 = r3.A0P()
            X.C04220Ms.A06(r13)
            java.util.ArrayList r40 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            int r11 = r13.size()
            r10 = 0
            r5 = 0
        L_0x0814:
            if (r10 >= r11) goto L_0x0855
            X.7h3 r14 = X.C86154wM.A0Q(r13, r10)
            boolean r4 = X.AnonymousClass70G.A01(r14)
            if (r4 == 0) goto L_0x084d
            r15 = r45
        L_0x0822:
            int r5 = r5 + r15
            r4 = r45
            if (r5 <= r4) goto L_0x0849
            java.util.List r5 = X.AnonymousClass00J.A0N(r12)
            r4 = r40
            r4.add(r5)
            r12.clear()
            r12.add(r14)
            r5 = r15
        L_0x0837:
            int r4 = X.C86104wH.A0B(r13)
            if (r10 != r4) goto L_0x0846
            java.util.List r14 = X.AnonymousClass00J.A0N(r12)
            r4 = r40
            r4.add(r14)
        L_0x0846:
            int r10 = r10 + 1
            goto L_0x0814
        L_0x0849:
            r12.add(r14)
            goto L_0x0837
        L_0x084d:
            int r15 = X.AnonymousClass70G.A00(r14)
            goto L_0x0822
        L_0x0852:
            r42 = r41
            goto L_0x07ff
        L_0x0855:
            int r39 = r40.size()
            java.util.ArrayList r33 = X.C18240wQ.A0k(r39)
            java.util.List r4 = r3.A0P()
            java.util.ArrayList r27 = X.C18200wM.A0t(r4)
            int r5 = r3.A02
            java.util.List r4 = r3.A0P()
            int r10 = r4.size()
            android.util.LongSparseArray r38 = new android.util.LongSparseArray
            r4 = r38
            r4.<init>(r10)
            X.Lyh r11 = r7.A00()
            long r4 = (long) r5
            r10 = r38
            r11.A01(r4, r10)
            X.Lyh r10 = r7.A00()
            java.lang.Object r37 = r10.A00(r4)
            r4 = r37
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4
            r37 = r4
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            r4 = r54
            int r4 = r4.left
            int r5 = r5 - r4
            r4 = r54
            int r4 = r4.right
            int r5 = r5 - r4
            int r10 = android.view.View.MeasureSpec.getSize(r9)
            r4 = r54
            int r4 = r4.top
            int r10 = r10 - r4
            r4 = r54
            int r4 = r4.bottom
            int r10 = r10 - r4
            if (r6 == r0) goto L_0x08ad
            r5 = r10
        L_0x08ad:
            r4 = r45
            int[] r4 = new int[r4]
            r36 = r4
            int r12 = r5 / r45
            int r5 = r5 % r45
            r10 = 0
            r11 = 0
        L_0x08b9:
            r4 = r45
            if (r10 >= r4) goto L_0x08cf
            int r11 = r11 + r5
            if (r11 <= 0) goto L_0x08cd
            int r4 = r45 - r11
            if (r4 >= r5) goto L_0x08cd
            int r4 = r12 + 1
            int r11 = r11 - r45
        L_0x08c8:
            r36[r10] = r4
            int r10 = r10 + 1
            goto L_0x08b9
        L_0x08cd:
            r4 = r12
            goto L_0x08c8
        L_0x08cf:
            java.util.List r4 = r3.A0P()
            java.util.ArrayList r35 = X.C18200wM.A0t(r4)
            int r34 = r40.size()
            r16 = 0
        L_0x08dd:
            r5 = r34
            r4 = r16
            if (r4 >= r5) goto L_0x0b83
            r5 = r40
            java.util.List r32 = X.C86164wN.A0k(r5, r4)
            java.util.ArrayList r31 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r30 = X.AnonymousClass0wJ.A0v()
            boolean r29 = X.AnonymousClass6Q3.A00(r47)
            java.util.ArrayList r28 = X.C18200wM.A0t(r32)
            java.util.Iterator r26 = r32.iterator()
            r13 = 0
        L_0x08fe:
            boolean r4 = r26.hasNext()
            if (r4 == 0) goto L_0x09c6
            X.7h3 r5 = X.C86144wL.A0V(r26)
            boolean r4 = X.AnonymousClass70G.A01(r5)
            if (r4 == 0) goto L_0x09c0
            r10 = r45
        L_0x0910:
            int r10 = r10 + r13
            int r10 = r10 - r0
            if (r6 != r0) goto L_0x09b8
            if (r16 != 0) goto L_0x09bc
        L_0x0916:
            r25 = 1
        L_0x0918:
            if (r6 != r0) goto L_0x09b0
            if (r13 != 0) goto L_0x09b4
        L_0x091c:
            r21 = 1
        L_0x091e:
            if (r6 != r0) goto L_0x09a4
            int r4 = r45 + -1
            if (r10 != r4) goto L_0x09ac
        L_0x0924:
            r23 = 1
        L_0x0926:
            if (r6 != r0) goto L_0x099c
            int r5 = r39 + -1
            r4 = r16
            if (r4 != r5) goto L_0x09a1
        L_0x092e:
            r22 = 1
        L_0x0930:
            r4 = r44
            double r14 = (double) r4
            r4 = r45
            double r4 = (double) r4
            r19 = r4
            double r14 = r14 / r4
            r4 = r43
            double r11 = (double) r4
            double r11 = r11 / r19
            if (r21 == 0) goto L_0x098f
            r21 = 0
        L_0x0942:
            if (r25 == 0) goto L_0x0982
            r13 = 0
        L_0x0945:
            if (r23 == 0) goto L_0x0971
            r14 = 0
        L_0x0948:
            if (r22 == 0) goto L_0x0960
            r5 = 0
        L_0x094b:
            r4 = r21
            if (r29 != 0) goto L_0x095b
            android.graphics.Rect r5 = X.C86164wN.A0F(r4, r13, r14, r5)
        L_0x0953:
            r4 = r28
            r4.add(r5)
            int r13 = r10 + 1
            goto L_0x08fe
        L_0x095b:
            android.graphics.Rect r5 = X.C86164wN.A0F(r14, r13, r4, r5)
            goto L_0x0953
        L_0x0960:
            if (r6 != 0) goto L_0x096e
            int r4 = r10 + 1
            double r4 = (double) r4
            double r19 = r4 * r11
            int r4 = X.AnonymousClass8bA.A00(r19)
            int r5 = r43 - r4
            goto L_0x094b
        L_0x096e:
            int r5 = r43 >> 1
            goto L_0x094b
        L_0x0971:
            if (r6 != r0) goto L_0x097f
            int r4 = r10 + 1
            double r4 = (double) r4
            double r19 = r4 * r14
            int r4 = X.AnonymousClass8bA.A00(r19)
            int r14 = r44 - r4
            goto L_0x0948
        L_0x097f:
            int r14 = r44 >> 1
            goto L_0x0948
        L_0x0982:
            if (r6 != 0) goto L_0x098c
            double r4 = (double) r13
            double r19 = r4 * r11
            int r13 = X.AnonymousClass8bA.A00(r19)
            goto L_0x0945
        L_0x098c:
            int r13 = r43 >> 1
            goto L_0x0945
        L_0x098f:
            if (r6 != r0) goto L_0x0999
            double r4 = (double) r13
            double r19 = r4 * r14
            int r21 = X.AnonymousClass8bA.A00(r19)
            goto L_0x0942
        L_0x0999:
            int r21 = r44 >> 1
            goto L_0x0942
        L_0x099c:
            int r4 = r45 + -1
            if (r10 != r4) goto L_0x09a1
            goto L_0x092e
        L_0x09a1:
            r22 = 0
            goto L_0x0930
        L_0x09a4:
            int r5 = r39 + -1
            r4 = r16
            if (r4 != r5) goto L_0x09ac
            goto L_0x0924
        L_0x09ac:
            r23 = 0
            goto L_0x0926
        L_0x09b0:
            if (r16 != 0) goto L_0x09b4
            goto L_0x091c
        L_0x09b4:
            r21 = 0
            goto L_0x091e
        L_0x09b8:
            if (r13 != 0) goto L_0x09bc
            goto L_0x0916
        L_0x09bc:
            r25 = 0
            goto L_0x0918
        L_0x09c0:
            int r10 = X.AnonymousClass70G.A00(r5)
            goto L_0x0910
        L_0x09c6:
            int r20 = r32.size()
            r23 = 0
            r22 = 0
            r10 = 0
        L_0x09cf:
            r4 = r20
            if (r10 >= r4) goto L_0x0adf
            r4 = r32
            X.7h3 r12 = X.C86154wM.A0Q(r4, r10)
            boolean r19 = X.AnonymousClass70G.A01(r12)
            if (r19 == 0) goto L_0x0ad9
            r5 = r45
        L_0x09e1:
            r4 = r28
            java.lang.Object r13 = r4.get(r10)
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            r4 = r35
            r4.add(r13)
            if (r42 == 0) goto L_0x0ad5
            float r4 = r42.floatValue()
            java.lang.Float r15 = java.lang.Float.valueOf(r4)
        L_0x09f8:
            r4 = r10
            int r5 = r5 + r10
            r11 = 0
        L_0x09fb:
            if (r4 >= r5) goto L_0x0a03
            r14 = r36[r4]
            int r11 = r11 + r14
            int r4 = r4 + 1
            goto L_0x09fb
        L_0x0a03:
            if (r6 != r0) goto L_0x0acf
            int r5 = r13.left
            int r4 = r13.right
        L_0x0a09:
            int r5 = r5 + r4
            int r11 = r11 - r5
            if (r15 == 0) goto L_0x0acb
            if (r19 != 0) goto L_0x0acb
            float r4 = (float) r11
            float r5 = r15.floatValue()
            float r4 = r4 * r5
            int r4 = (int) r4
            int r14 = X.C86134wK.A04(r4)
        L_0x0a1a:
            if (r6 != 0) goto L_0x0ac5
            r4 = r14
            int r14 = X.C86134wK.A04(r11)
        L_0x0a21:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            kotlin.Pair r5 = X.C18180wK.A0p(r5, r4)
            java.lang.Object r4 = r5.A00
            int r19 = X.AnonymousClass0wJ.A04(r4)
            java.lang.Object r4 = r5.A01
            int r15 = X.AnonymousClass0wJ.A04(r4)
            X.6jl r11 = new X.6jl
            r5 = r19
            r11.<init>(r13, r5, r15)
            r4 = r31
            r4.add(r11)
            r4 = r24
            X.C04220Ms.A0B(r12, r4)
            int r4 = r12.A02
            long r4 = (long) r4
            r11 = r38
            java.lang.Object r11 = r11.get(r4)
            X.6hm r11 = (X.C108076hm) r11
            r13 = 0
            if (r11 != 0) goto L_0x0a64
            if (r37 == 0) goto L_0x0a6c
            r11 = r37
            java.lang.Object r11 = r11.get(r4)
            X.6hm r11 = (X.C108076hm) r11
            if (r11 == 0) goto L_0x0a6c
        L_0x0a64:
            X.5fU r4 = r11.A00
            if (r4 == 0) goto L_0x0a6c
            X.7J7 r13 = r4.A01()
        L_0x0a6c:
            X.7h5 r5 = new X.7h5
            r4 = r41
            r5.<init>(r12, r4)
            X.AnonymousClass2LE.A00(r1)
            int r4 = r7.A03
            X.84n r14 = new X.84n
            r46 = r14
            r48 = r13
            r49 = r5
            r50 = r17
            r51 = r4
            r52 = r19
            r53 = r15
            r46.<init>(r47, r48, r49, r50, r51, r52, r53)
            X.5fU r11 = new X.5fU
            r5 = r19
            r11.<init>(r13, r14, r5, r15)
            int r4 = r12.A02
            long r4 = (long) r4
            X.6hm r13 = new X.6hm
            r13.<init>(r11, r12)
            r11 = r38
            r11.put(r4, r13)
            X.5fU r4 = r13.A00
            java.lang.Object r4 = r4.A00()
            X.7J7 r4 = (X.AnonymousClass7J7) r4
            X.7Di r4 = r4.A02
            com.facebook.rendercore.RenderTreeNode r4 = r4.A04
            android.graphics.Rect r11 = r4.A04
            int r5 = r11.width()
            r4 = r22
            int r22 = java.lang.Math.max(r4, r5)
            int r5 = r11.height()
            r4 = r23
            int r23 = java.lang.Math.max(r4, r5)
            int r10 = r10 + 1
            goto L_0x09cf
        L_0x0ac5:
            int r4 = X.C86134wK.A04(r11)
            goto L_0x0a21
        L_0x0acb:
            int r14 = X.AnonymousClass7I7.A00
            goto L_0x0a1a
        L_0x0acf:
            int r5 = r13.top
            int r4 = r13.bottom
            goto L_0x0a09
        L_0x0ad5:
            r15 = r41
            goto L_0x09f8
        L_0x0ad9:
            int r5 = X.AnonymousClass70G.A00(r12)
            goto L_0x09e1
        L_0x0adf:
            int r21 = r32.size()
            r11 = 0
        L_0x0ae4:
            r4 = r21
            if (r11 >= r4) goto L_0x0b78
            r4 = r32
            X.7h3 r12 = X.C86164wN.A0S(r4, r11)
            r4 = r31
            java.lang.Object r10 = r4.get(r11)
            X.6jl r10 = (X.C109286jl) r10
            if (r6 != 0) goto L_0x0b6f
            int r20 = X.C86134wK.A04(r22)
            int r4 = r10.A00
            r19 = r4
        L_0x0b00:
            r4 = r24
            X.C04220Ms.A0B(r12, r4)
            int r4 = r12.A02
            long r4 = (long) r4
            r13 = r38
            java.lang.Object r13 = r13.get(r4)
            X.6hm r13 = (X.C108076hm) r13
            r14 = 0
            if (r13 != 0) goto L_0x0b1f
            if (r37 == 0) goto L_0x0b27
            r13 = r37
            java.lang.Object r13 = r13.get(r4)
            X.6hm r13 = (X.C108076hm) r13
            if (r13 == 0) goto L_0x0b27
        L_0x0b1f:
            X.5fU r4 = r13.A00
            if (r4 == 0) goto L_0x0b27
            X.7J7 r14 = r4.A01()
        L_0x0b27:
            X.7h5 r5 = new X.7h5
            r4 = r41
            r5.<init>(r12, r4)
            X.AnonymousClass2LE.A00(r1)
            int r4 = r7.A03
            X.84n r15 = new X.84n
            r46 = r15
            r48 = r14
            r49 = r5
            r50 = r17
            r51 = r4
            r52 = r20
            r53 = r19
            r46.<init>(r47, r48, r49, r50, r51, r52, r53)
            X.5fU r13 = new X.5fU
            r5 = r20
            r4 = r19
            r13.<init>(r14, r15, r5, r4)
            int r4 = r12.A02
            long r4 = (long) r4
            X.6hm r14 = new X.6hm
            r14.<init>(r13, r12)
            r12 = r38
            r12.put(r4, r14)
            X.6ho r5 = new X.6ho
            r5.<init>(r14, r10)
            r4 = r30
            r4.add(r5)
            r4 = r27
            r4.add(r14)
            int r11 = r11 + 1
            goto L_0x0ae4
        L_0x0b6f:
            int r4 = r10.A01
            r20 = r4
            int r19 = X.C86134wK.A04(r23)
            goto L_0x0b00
        L_0x0b78:
            r5 = r33
            r4 = r30
            r5.add(r4)
            int r16 = r16 + 1
            goto L_0x08dd
        L_0x0b83:
            java.lang.Object r4 = X.AnonymousClass7K7.A03(r1, r3)
            X.7qj r4 = (X.C130767qj) r4
            r1 = r35
            r4.A08 = r1
            int r26 = android.view.View.MeasureSpec.getMode(r8)
            int r25 = android.view.View.MeasureSpec.getMode(r9)
            if (r6 != r0) goto L_0x0ba0
            if (r26 != 0) goto L_0x0ba9
            java.lang.String r0 = "GridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0ba0:
            if (r25 != 0) goto L_0x0ba9
            java.lang.String r0 = "GridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0ba9:
            int r24 = android.view.View.MeasureSpec.getSize(r8)
            r4 = 1073741824(0x40000000, float:2.0)
            r23 = -1
            r1 = r26
            if (r1 == r4) goto L_0x0bb9
            r22 = -1
            if (r6 != r0) goto L_0x0bbb
        L_0x0bb9:
            r22 = r24
        L_0x0bbb:
            int r21 = android.view.View.MeasureSpec.getSize(r9)
            r1 = r25
            if (r1 == r4) goto L_0x0bc5
            if (r6 != 0) goto L_0x0bc7
        L_0x0bc5:
            r23 = r21
        L_0x0bc7:
            r15 = -1
            r1 = r22
            if (r1 == r15) goto L_0x0bfe
            r1 = r23
            if (r1 == r15) goto L_0x0bfe
        L_0x0bd0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
        L_0x0bd4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r0)
            java.lang.Object r0 = r1.A00
            int r5 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            int r4 = X.AnonymousClass0wJ.A04(r0)
            X.6ix r1 = new X.6ix
            r0 = r27
            r1.<init>(r0, r5, r4)
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x0bfe:
            r1 = r54
            int r14 = r1.left
            int r1 = r1.right
            int r14 = r14 + r1
            r1 = r54
            int r13 = r1.top
            int r1 = r1.bottom
            int r13 = r13 + r1
            int r20 = r33.size()
            r12 = 0
        L_0x0c11:
            r1 = r20
            if (r12 >= r1) goto L_0x0c98
            r1 = r33
            java.lang.Object r19 = r1.get(r12)
            r1 = r19
            java.util.List r1 = (java.util.List) r1
            r19 = r1
            int r17 = r19.size()
            r16 = 0
            r11 = 0
            r10 = 0
        L_0x0c29:
            r1 = r17
            if (r10 >= r1) goto L_0x0c6e
            r1 = r19
            java.lang.Object r4 = r1.get(r10)
            X.6ho r4 = (X.C108096ho) r4
            X.6jl r1 = r4.A01
            android.graphics.Rect r7 = r1.A02
            X.6hm r1 = r4.A00
            X.5fU r1 = r1.A00
            java.lang.Object r1 = r1.A00()
            X.C04220Ms.A06(r1)
            X.7J7 r1 = (X.AnonymousClass7J7) r1
            X.7Di r1 = r1.A02
            com.facebook.rendercore.RenderTreeNode r1 = r1.A04
            android.graphics.Rect r1 = r1.A04
            r4 = r1
            int r5 = r1.width()
            int r1 = r7.left
            int r5 = r5 + r1
            int r1 = r7.right
            int r5 = r5 + r1
            int r4 = r4.height()
            int r1 = r7.top
            int r4 = r4 + r1
            int r1 = r7.bottom
            int r4 = r4 + r1
            r1 = r16
            int r16 = java.lang.Math.max(r1, r5)
            int r11 = java.lang.Math.max(r11, r4)
            int r10 = r10 + 1
            goto L_0x0c29
        L_0x0c6e:
            int r14 = r14 + r16
            int r13 = r13 + r11
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != 0) goto L_0x0c89
            r1 = r26
            if (r1 != r4) goto L_0x0c7f
            r1 = r24
            if (r14 < r1) goto L_0x0c7f
            r22 = r1
        L_0x0c7f:
            r1 = r22
            if (r1 == r15) goto L_0x0c94
            r1 = r23
            if (r1 == r15) goto L_0x0c94
            goto L_0x0bd0
        L_0x0c89:
            r1 = r25
            if (r1 != r4) goto L_0x0c7f
            r1 = r21
            if (r13 < r1) goto L_0x0c7f
            r23 = r1
            goto L_0x0c7f
        L_0x0c94:
            int r12 = r12 + 1
            goto L_0x0c11
        L_0x0c98:
            if (r6 != r0) goto L_0x0ca8
            r0 = r23
            if (r0 != r15) goto L_0x0ca0
            r23 = r13
        L_0x0ca0:
            r14 = r22
        L_0x0ca2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x0bd4
        L_0x0ca8:
            r0 = r22
            if (r0 == r15) goto L_0x0ca2
            goto L_0x0ca0
        L_0x0cad:
            r4 = 99
            android.util.SparseArray r11 = r3.A04
            java.lang.String r5 = X.C86114wI.A0m(r11, r4)
            if (r5 != 0) goto L_0x0cb9
            java.lang.String r5 = "v1"
        L_0x0cb9:
            java.lang.String r4 = "v2"
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 == 0) goto L_0x0f28
            java.lang.String r4 = "ListCollectionMeasureV2Helper"
            int r10 = X.C101116Py.A00(r3)
            r1 = 63
            java.lang.Object r1 = A0A(r3, r1)
            boolean r12 = X.AnonymousClass2LL.A00(r1, r6)
            int r5 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r12 != 0) goto L_0x0cdf
            if (r10 != r0) goto L_0x0d3c
            if (r5 != 0) goto L_0x0d3f
        L_0x0cdf:
            r17 = 1
            if (r12 != 0) goto L_0x0ce7
        L_0x0ce3:
            if (r10 != r0) goto L_0x0d36
            if (r1 != 0) goto L_0x0d39
        L_0x0ce7:
            r16 = 1
        L_0x0ce9:
            if (r17 != 0) goto L_0x0cee
            r14 = 0
            if (r16 == 0) goto L_0x0cef
        L_0x0cee:
            r14 = 1
        L_0x0cef:
            X.6jk r32 = new X.6jk
            r1 = r32
            r1.<init>(r7, r3)
            java.util.List r1 = r3.A0P()
            java.util.ArrayList r31 = X.C18200wM.A0t(r1)
            java.util.Iterator r13 = r1.iterator()
        L_0x0d02:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0d42
            java.lang.Object r12 = r13.next()
            X.7h3 r12 = (X.C127397h3) r12
            X.C04220Ms.A04(r12)
            r38 = r8
            r39 = r9
            if (r10 != r0) goto L_0x0d1b
            r38 = r9
            r39 = r8
        L_0x0d1b:
            r40 = r17 ^ 1
            r33 = r7
            r34 = r12
            r35 = r3
            r36 = r32
            r37 = r10
            X.5fU r1 = X.C121957Iy.A00(r33, r34, r35, r36, r37, r38, r39, r40)
            X.6hm r5 = new X.6hm
            r5.<init>(r1, r12)
            r1 = r31
            r1.add(r5)
            goto L_0x0d02
        L_0x0d36:
            if (r5 != 0) goto L_0x0d39
            goto L_0x0ce7
        L_0x0d39:
            r16 = 0
            goto L_0x0ce9
        L_0x0d3c:
            if (r1 != 0) goto L_0x0d3f
            goto L_0x0cdf
        L_0x0d3f:
            r17 = 0
            goto L_0x0ce3
        L_0x0d42:
            if (r14 != 0) goto L_0x0d67
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int r4 = r3.A02
            r0 = r31
            X.AnonymousClass7GP.A01(r0, r4)
        L_0x0d53:
            X.6ix r4 = new X.6ix
            r4.<init>(r0, r5, r1)
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r4
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x0d67:
            r1 = 55
            r12 = 0
            float r5 = A00(r3, r1)     // Catch:{ 1zB -> 0x0d6f }
            goto L_0x0d7d
        L_0x0d6f:
            java.lang.String r5 = "Invalid format for spacing-after: "
            java.lang.String r1 = X.C86114wI.A0m(r11, r1)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r5, r1)
            X.C30967GcS.A02(r4, r1)
            r5 = 0
        L_0x0d7d:
            r1 = 56
            float r13 = A00(r3, r1)     // Catch:{ 1zB -> 0x0d84 }
            goto L_0x0d92
        L_0x0d84:
            java.lang.String r13 = "Invalid format for spacing-before: "
            java.lang.String r1 = X.C86114wI.A0m(r11, r1)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r13, r1)
            X.C30967GcS.A02(r4, r1)
            r13 = 0
        L_0x0d92:
            r1 = 44
            float r12 = A00(r3, r1)     // Catch:{ 1zB -> 0x0d99 }
            goto L_0x0da6
        L_0x0d99:
            java.lang.String r14 = "Invalid format for item-spacing: "
            java.lang.String r1 = X.C86114wI.A0m(r11, r1)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r14, r1)
            X.C30967GcS.A02(r4, r1)
        L_0x0da6:
            int r1 = (int) r13
            r19 = r1
            int r15 = (int) r12
            int r4 = (int) r5
            r11 = r16
            if (r10 != r0) goto L_0x0db3
            r11 = r17
            r17 = r16
        L_0x0db3:
            r5 = 0
            r30 = 0
            r29 = 1
            if (r10 != 0) goto L_0x0dbe
            r30 = 1
            r29 = 0
        L_0x0dbe:
            int r28 = android.view.View.MeasureSpec.getMode(r8)
            int r27 = android.view.View.MeasureSpec.getMode(r9)
            r1 = r24
            int[] r14 = new int[r1]
            r14 = {-1, -1} // fill-array
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r28 == 0) goto L_0x0f1a
            int r12 = android.view.View.MeasureSpec.getSize(r8)
        L_0x0dd6:
            if (r11 != 0) goto L_0x0dda
            r14[r6] = r12
        L_0x0dda:
            if (r27 == 0) goto L_0x0de0
            int r13 = android.view.View.MeasureSpec.getSize(r9)
        L_0x0de0:
            if (r17 != 0) goto L_0x0de4
            r14[r0] = r13
        L_0x0de4:
            r1 = r14[r6]
            r11 = -1
            if (r1 <= r11) goto L_0x0e3c
            r1 = r14[r0]
            if (r1 <= r11) goto L_0x0e3c
        L_0x0ded:
            r5 = r14[r6]
            java.util.Iterator r14 = r31.iterator()
            r11 = 0
        L_0x0df4:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0f1f
            java.lang.Object r4 = r14.next()
            int r13 = r11 + 1
            if (r11 >= 0) goto L_0x0e07
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0e07:
            X.6hm r4 = (X.C108076hm) r4
            X.7h3 r12 = r4.A01
            X.C04220Ms.A06(r12)
            r4 = r5
            if (r10 != r0) goto L_0x0e12
            r4 = r1
        L_0x0e12:
            r6 = 1073741824(0x40000000, float:2.0)
            int r24 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r4 = r1
            if (r10 != r0) goto L_0x0e1c
            r4 = r5
        L_0x0e1c:
            int r25 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r19 = r7
            r20 = r12
            r21 = r3
            r22 = r32
            r23 = r10
            r26 = r0
            X.5fU r4 = X.C121957Iy.A00(r19, r20, r21, r22, r23, r24, r25, r26)
            X.6hm r6 = new X.6hm
            r6.<init>(r4, r12)
            r4 = r31
            r4.set(r11, r6)
            r11 = r13
            goto L_0x0df4
        L_0x0e3c:
            r26 = 0
            r25 = 0
            r24 = 0
            if (r30 == 0) goto L_0x0e4a
            r26 = r19
            r25 = r15
            r24 = r4
        L_0x0e4a:
            r23 = 0
            r22 = 0
            r21 = 0
            if (r29 == 0) goto L_0x0e58
            r23 = r19
            r22 = r15
            r21 = r4
        L_0x0e58:
            r15 = 0
            r20 = 0
            r4 = 0
            r19 = 0
        L_0x0e5e:
            int r1 = r31.size()
            if (r15 >= r1) goto L_0x0ece
            r1 = r31
            java.lang.Object r1 = r1.get(r15)
            X.6hm r1 = (X.C108076hm) r1
            X.5fU r1 = r1.A00
            java.lang.Object r1 = r1.A00()
            X.7J7 r1 = (X.AnonymousClass7J7) r1
            X.7Di r1 = r1.A02
            r33 = r1
            boolean r17 = X.C18180wK.A1W(r15)
            int r1 = X.C86104wH.A0B(r31)
            boolean r16 = X.C86114wI.A1T(r15, r1)
            int r1 = X.AnonymousClass7Di.A01(r33)
            if (r16 == 0) goto L_0x0f02
            if (r17 == 0) goto L_0x0e8e
            int r1 = r26 + r1
        L_0x0e8e:
            int r1 = r1 + r25
        L_0x0e90:
            int r5 = java.lang.Math.max(r5, r1)
            int r20 = r20 + r1
            r1 = r14[r6]
            if (r1 > r11) goto L_0x0ea6
            if (r30 == 0) goto L_0x0ea0
            r1 = r20
            if (r1 >= r12) goto L_0x0ea4
        L_0x0ea0:
            if (r29 == 0) goto L_0x0ea6
            if (r5 < r12) goto L_0x0ea6
        L_0x0ea4:
            r14[r6] = r12
        L_0x0ea6:
            int r1 = X.AnonymousClass7Di.A00(r33)
            if (r16 == 0) goto L_0x0efb
            if (r17 == 0) goto L_0x0eb0
            int r1 = r23 + r1
        L_0x0eb0:
            int r1 = r1 + r22
        L_0x0eb2:
            int r4 = java.lang.Math.max(r4, r1)
            int r19 = r19 + r1
            if (r27 == 0) goto L_0x0ec6
            if (r29 == 0) goto L_0x0ec0
            r1 = r19
            if (r1 >= r13) goto L_0x0ec4
        L_0x0ec0:
            if (r30 == 0) goto L_0x0ec6
            if (r4 < r13) goto L_0x0ec6
        L_0x0ec4:
            r14[r0] = r13
        L_0x0ec6:
            r1 = r14[r6]
            if (r1 <= r11) goto L_0x0ef7
            r1 = r14[r0]
            if (r1 <= r11) goto L_0x0ef7
        L_0x0ece:
            r1 = r14[r6]
            if (r1 > r11) goto L_0x0eda
            if (r28 != 0) goto L_0x0ee9
            if (r30 == 0) goto L_0x0ed8
            r5 = r20
        L_0x0ed8:
            r14[r6] = r5
        L_0x0eda:
            r1 = r14[r0]
            if (r1 > r11) goto L_0x0ded
            if (r27 != 0) goto L_0x0f09
            if (r29 == 0) goto L_0x0ee4
            r4 = r19
        L_0x0ee4:
            r14[r0] = r4
            r1 = r4
            goto L_0x0ded
        L_0x0ee9:
            if (r30 == 0) goto L_0x0ef2
            r1 = r20
            int r5 = java.lang.Math.min(r1, r12)
            goto L_0x0ed8
        L_0x0ef2:
            int r5 = java.lang.Math.min(r5, r12)
            goto L_0x0ed8
        L_0x0ef7:
            int r15 = r15 + 1
            goto L_0x0e5e
        L_0x0efb:
            if (r17 == 0) goto L_0x0eff
            int r1 = r23 + r1
        L_0x0eff:
            int r1 = r1 + r21
            goto L_0x0eb2
        L_0x0f02:
            if (r17 == 0) goto L_0x0f06
            int r1 = r26 + r1
        L_0x0f06:
            int r1 = r1 + r24
            goto L_0x0e90
        L_0x0f09:
            if (r29 == 0) goto L_0x0f15
            r1 = r19
            int r1 = java.lang.Math.min(r1, r13)
        L_0x0f11:
            r14[r0] = r1
            goto L_0x0ded
        L_0x0f15:
            int r1 = java.lang.Math.min(r4, r13)
            goto L_0x0f11
        L_0x0f1a:
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0dd6
        L_0x0f1f:
            int r4 = r3.A02
            r0 = r31
            X.AnonymousClass7GP.A01(r0, r4)
            goto L_0x0d53
        L_0x0f28:
            int r25 = X.C101116Py.A00(r3)
            java.util.List r13 = r3.A0P()
            int r4 = r3.A02
            r34 = r4
            java.util.List r4 = r3.A0P()
            int r5 = r4.size()
            android.util.LongSparseArray r24 = new android.util.LongSparseArray
            r4 = r24
            r4.<init>(r5)
            X.Lyh r12 = r7.A00()
            r4 = r34
            long r4 = (long) r4
            r10 = r24
            r12.A01(r4, r10)
            X.Lyh r10 = r7.A00()
            java.lang.Object r23 = r10.A00(r4)
            r4 = r23
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4
            r23 = r4
            java.util.List r4 = r3.A0P()
            java.util.ArrayList r22 = X.C18200wM.A0t(r4)
            java.util.Iterator r21 = X.C86134wK.A0t(r13)
        L_0x0f69:
            boolean r4 = r21.hasNext()
            if (r4 == 0) goto L_0x1085
            java.lang.Object r10 = r21.next()
            X.7h3 r10 = (X.C127397h3) r10
            X.C04220Ms.A04(r10)
            int r12 = android.view.View.MeasureSpec.getSize(r8)
            r4 = r25
            if (r4 != r0) goto L_0x1081
            if (r12 == 0) goto L_0x1081
            int r20 = X.C86134wK.A04(r12)
        L_0x0f86:
            r13 = 132(0x84, float:1.85E-43)
            X.7h3 r14 = r10.A0K(r13)
            if (r14 == 0) goto L_0x0fc9
            int r5 = r14.A03
            r4 = 13366(0x3436, float:1.873E-41)
            if (r5 != r4) goto L_0x0fc9
            java.lang.String r14 = A0D(r14)
            if (r25 != 0) goto L_0x0fc9
            if (r14 == 0) goto L_0x0fc9
            X.77p r4 = X.AnonymousClass7Kk.A0C(r14)     // Catch:{ 1zB -> 0x0fbe }
            float r5 = r4.A00     // Catch:{ 1zB -> 0x0fbe }
            java.lang.Integer r4 = r4.A01     // Catch:{ 1zB -> 0x0fbe }
            int r4 = r4.intValue()     // Catch:{ 1zB -> 0x0fbe }
            if (r4 == r6) goto L_0x0fb8
            if (r4 != r0) goto L_0x0fc9
            float r4 = (float) r12     // Catch:{ 1zB -> 0x0fbe }
            float r5 = r5 * r4
            double r4 = (double) r5     // Catch:{ 1zB -> 0x0fbe }
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r15
            int r12 = (int) r4     // Catch:{ 1zB -> 0x0fbe }
            int r20 = X.C86134wK.A04(r12)     // Catch:{ 1zB -> 0x0fbe }
            goto L_0x0fc9
        L_0x0fb8:
            int r4 = (int) r5     // Catch:{ 1zB -> 0x0fbe }
            int r20 = X.C86134wK.A04(r4)     // Catch:{ 1zB -> 0x0fbe }
            goto L_0x0fc9
        L_0x0fbe:
            java.lang.String r4 = "Error parsing style width: "
            java.lang.String r5 = X.AnonymousClass00U.A0L(r4, r14)
            java.lang.String r4 = "ListCollectionMeasureHelper"
            X.C30967GcS.A02(r4, r5)
        L_0x0fc9:
            int r5 = android.view.View.MeasureSpec.getSize(r9)
            r4 = r25
            if (r4 == r0) goto L_0x0fee
            if (r5 == 0) goto L_0x0fee
            int r12 = X.C86134wK.A04(r5)
        L_0x0fd7:
            X.7h3 r14 = r10.A0K(r13)
            if (r14 == 0) goto L_0x101e
            int r13 = r14.A03
            r4 = 13366(0x3436, float:1.873E-41)
            if (r13 != r4) goto L_0x101e
            java.lang.String r14 = X.C18220wO.A0o(r14)
            r4 = r25
            if (r4 != r0) goto L_0x101e
            if (r14 == 0) goto L_0x101e
            goto L_0x0ff1
        L_0x0fee:
            int r12 = X.AnonymousClass7I7.A00
            goto L_0x0fd7
        L_0x0ff1:
            X.77p r4 = X.AnonymousClass7Kk.A0C(r14)     // Catch:{ 1zB -> 0x1013 }
            float r13 = r4.A00     // Catch:{ 1zB -> 0x1013 }
            java.lang.Integer r4 = r4.A01     // Catch:{ 1zB -> 0x1013 }
            int r4 = r4.intValue()     // Catch:{ 1zB -> 0x1013 }
            if (r4 == r6) goto L_0x100d
            if (r4 != r0) goto L_0x101e
            float r4 = (float) r5     // Catch:{ 1zB -> 0x1013 }
            float r13 = r13 * r4
            double r4 = (double) r13     // Catch:{ 1zB -> 0x1013 }
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r15
            int r13 = (int) r4     // Catch:{ 1zB -> 0x1013 }
            int r12 = X.C86134wK.A04(r13)     // Catch:{ 1zB -> 0x1013 }
            goto L_0x101e
        L_0x100d:
            int r4 = (int) r13     // Catch:{ 1zB -> 0x1013 }
            int r12 = X.C86134wK.A04(r4)     // Catch:{ 1zB -> 0x1013 }
            goto L_0x101e
        L_0x1013:
            java.lang.String r4 = "Error parsing style height: "
            java.lang.String r5 = X.AnonymousClass00U.A0L(r4, r14)
            java.lang.String r4 = "ListCollectionMeasureHelper"
            X.C30967GcS.A02(r4, r5)
        L_0x101e:
            int r4 = r10.A02
            long r15 = (long) r4
            r13 = r24
            r4 = r15
            java.lang.Object r4 = r13.get(r4)
            X.6hm r4 = (X.C108076hm) r4
            r19 = 0
            if (r4 != 0) goto L_0x103b
            if (r23 == 0) goto L_0x1043
            r13 = r23
            r4 = r15
            java.lang.Object r4 = r13.get(r4)
            X.6hm r4 = (X.C108076hm) r4
            if (r4 == 0) goto L_0x1043
        L_0x103b:
            X.5fU r4 = r4.A00
            if (r4 == 0) goto L_0x1043
            X.7J7 r19 = r4.A01()
        L_0x1043:
            android.content.Context r4 = r7.A04
            r27 = r4
            r5 = 0
            X.7h5 r14 = new X.7h5
            r14.<init>(r10, r5)
            X.AnonymousClass2LE.A00(r1)
            int r4 = r7.A03
            X.84n r13 = new X.84n
            r26 = r13
            r28 = r19
            r29 = r14
            r30 = r17
            r31 = r4
            r32 = r20
            r33 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            X.5fU r5 = new X.5fU
            r14 = r13
            r13 = r19
            r4 = r20
            r5.<init>(r13, r14, r4, r12)
            X.6hm r12 = new X.6hm
            r12.<init>(r5, r10)
            r10 = r24
            r4 = r15
            r10.put(r4, r12)
            r4 = r22
            r4.add(r12)
            goto L_0x0f69
        L_0x1081:
            int r20 = X.AnonymousClass7I7.A00
            goto L_0x0f86
        L_0x1085:
            r1 = 63
            java.lang.Object r1 = A0A(r3, r1)
            boolean r1 = X.AnonymousClass2LL.A00(r1, r6)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x10d4
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getMode(r9)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == r1) goto L_0x10a3
            if (r7 != r4) goto L_0x10d4
        L_0x10a3:
            if (r5 == r1) goto L_0x10a7
            if (r5 != r4) goto L_0x10d4
        L_0x10a7:
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int[] r1 = new int[]{r4, r1}
        L_0x10b3:
            r5 = r1[r6]
            r4 = r1[r0]
            r1 = r22
            r0 = r34
            X.AnonymousClass7GP.A01(r1, r0)
            X.6ix r1 = new X.6ix
            r0 = r22
            r1.<init>(r0, r5, r4)
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x10d4:
            r1 = 55
            java.lang.String r4 = X.C86114wI.A0m(r11, r1)     // Catch:{ 1zB -> 0x3281 }
            r1 = 56
            java.lang.String r10 = X.C86114wI.A0m(r11, r1)     // Catch:{ 1zB -> 0x3281 }
            r1 = 44
            java.lang.String r5 = X.C86114wI.A0m(r11, r1)     // Catch:{ 1zB -> 0x3281 }
            r7 = 0
            if (r4 == 0) goto L_0x10ed
            float r7 = X.AnonymousClass7Kk.A01(r4)     // Catch:{ 1zB -> 0x3281 }
        L_0x10ed:
            r4 = 0
            if (r10 == 0) goto L_0x10f4
            float r4 = X.AnonymousClass7Kk.A01(r10)     // Catch:{ 1zB -> 0x3281 }
        L_0x10f4:
            r1 = 0
            if (r5 == 0) goto L_0x10fb
            float r1 = X.AnonymousClass7Kk.A01(r5)     // Catch:{ 1zB -> 0x3281 }
        L_0x10fb:
            int r5 = (int) r4     // Catch:{ 1zB -> 0x3281 }
            int r4 = (int) r1     // Catch:{ 1zB -> 0x3281 }
            int r1 = (int) r7     // Catch:{ 1zB -> 0x3281 }
            r7 = r22
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r25
            int[] r1 = X.C98906Hj.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 1zB -> 0x3281 }
            goto L_0x10b3
        L_0x110a:
            r21 = 13320(0x3408, float:1.8665E-41)
            r4 = r21
            if (r0 != r4) goto L_0x12c1
            X.7KN r20 = X.AnonymousClass6YH.A00
            r1 = 49
            android.util.SparseArray r0 = r3.A04
            java.lang.String r1 = X.C86114wI.A0m(r0, r1)
            if (r1 == 0) goto L_0x1128
            java.lang.String r0 = "gone"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1128
            X.MeD r0 = X.C120827Cr.A00
            goto L_0x07bb
        L_0x1128:
            android.content.Context r0 = r7.A04
            boolean r0 = X.C98926Hl.A00(r0)
            r14 = r0 ^ 1
            X.7h3 r6 = X.AnonymousClass7KN.A02(r3)
            X.M1O r5 = new X.M1O
            r5.<init>()
            X.MJu r0 = new X.MJu
            r0.<init>(r5, r3)
            r3.A0S(r0)
            if (r14 != 0) goto L_0x115a
            r11 = 2
            X.M1O.A00(r5, r11)
            float[] r10 = r5.A01
            int r4 = r5.A00
            int r1 = r4 + 1
            r5.A00 = r1
            r0 = 0
            float r0 = (float) r0
            r10[r4] = r0
            int r0 = r1 + 1
            r5.A00 = r0
            float r0 = (float) r11
            r10[r1] = r0
        L_0x115a:
            if (r6 == 0) goto L_0x1164
            X.7qM r0 = new X.7qM
            r0.<init>(r5, r14)
            r6.A0S(r0)
        L_0x1164:
            float[] r1 = r5.A01
            int r0 = r5.A00
            float[] r22 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r19 = r3.A0P()
            int r0 = r19.size()
            float[][] r1 = new float[r0][]
            int r0 = r19.size()
            com.facebook.flexlayout.styles.FlexItemCallback[] r0 = new com.facebook.flexlayout.styles.FlexItemCallback[r0]
            java.util.Iterator r17 = r19.iterator()
            r13 = 0
        L_0x1181:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x121d
            java.lang.Object r12 = r17.next()
            X.8gn r12 = (X.C143468gn) r12
            boolean r4 = r12 instanceof X.C127397h3
            if (r4 == 0) goto L_0x11ad
            r6 = r12
            X.7h3 r6 = (X.C127397h3) r6
            int r5 = r6.A03
            r4 = r21
            if (r5 != r4) goto L_0x11ad
            r5 = 49
            android.util.SparseArray r4 = r6.A04
            java.lang.String r5 = X.C86114wI.A0m(r4, r5)
            if (r5 == 0) goto L_0x11ad
            java.lang.String r4 = "gone"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x11ad
            goto L_0x1181
        L_0x11ad:
            X.7h3 r11 = X.AnonymousClass7KN.A02(r12)
            if (r11 == 0) goto L_0x121a
            X.7JE r10 = new X.7JE
            r10.<init>()
            r5 = 62
            android.util.SparseArray r4 = r11.A04
            java.lang.String r6 = X.C86114wI.A0m(r4, r5)
            if (r6 == 0) goto L_0x1218
            java.lang.String r5 = X.C86114wI.A0m(r4, r5)
            r4 = 754(0x2f2, float:1.057E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x1218
            r6 = 1
            float[] r16 = X.AnonymousClass7JE.A03(r10)
            int r5 = r10.A00
            int r4 = r5 + 1
            r10.A00 = r4
            r15 = 21
            float r15 = (float) r15
            r16[r5] = r15
            int r5 = r4 + 1
            r10.A00 = r5
            float r5 = (float) r6
            r16[r4] = r5
        L_0x11e9:
            if (r14 == 0) goto L_0x1213
            java.lang.Integer r15 = X.AnonymousClass006.A00
            java.lang.Integer r5 = X.AnonymousClass006.A0C
        L_0x11ef:
            X.7qN r4 = new X.7qN
            r4.<init>(r10, r15, r5, r6)
            r11.A0S(r4)
        L_0x11f7:
            float[] r5 = r10.A01
            int r4 = r10.A00
            float[] r4 = java.util.Arrays.copyOf(r5, r4)
            r1[r13] = r4
            X.76L r5 = new X.76L
            r4 = r20
            r5.<init>(r7, r12, r4, r14)
            com.facebook.flexlayout.styles.FlexItemCallback r4 = new com.facebook.flexlayout.styles.FlexItemCallback
            r4.<init>(r5)
            r0[r13] = r4
            int r13 = r13 + 1
            goto L_0x1181
        L_0x1213:
            java.lang.Integer r15 = X.AnonymousClass006.A0C
            java.lang.Integer r5 = X.AnonymousClass006.A00
            goto L_0x11ef
        L_0x1218:
            r6 = 0
            goto L_0x11e9
        L_0x121a:
            X.7JE r10 = X.AnonymousClass7KN.A00
            goto L_0x11f7
        L_0x121d:
            int r4 = r19.size()
            if (r4 <= r13) goto L_0x122f
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
            float[][] r1 = (float[][]) r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            com.facebook.flexlayout.styles.FlexItemCallback[] r0 = (com.facebook.flexlayout.styles.FlexItemCallback[]) r0
        L_0x122f:
            float[] r15 = X.C120827Cr.A01(r8)
            float[] r14 = X.C120827Cr.A01(r9)
            r6 = 1
            r13 = r15[r6]
            r12 = r14[r6]
            X.7h3 r11 = X.AnonymousClass7KN.A02(r3)
            if (r11 != 0) goto L_0x1288
            r10 = 0
        L_0x1243:
            r13 = 0
            if (r10 == 0) goto L_0x1266
            r12 = r10[r13]
            r4 = 2
            r11 = r10[r4]
            r4 = 4
            r7 = r10[r4]
            r5 = r15[r13]
            r4 = r15[r6]
            float[] r15 = X.C120827Cr.A00(r12, r11, r7, r5, r4)
            r12 = r10[r6]
            r4 = 3
            r11 = r10[r4]
            r4 = 5
            r7 = r10[r4]
            r5 = r14[r13]
            r4 = r14[r6]
            float[] r14 = X.C120827Cr.A00(r12, r11, r7, r5, r4)
        L_0x1266:
            r24 = r15[r13]
            r25 = r15[r6]
            r26 = r14[r13]
            r27 = r14[r6]
            int r5 = r1.length
            com.facebook.flexlayout.layoutoutput.LayoutOutput r4 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r4.<init>(r5)
            r28 = r25
            r29 = r27
            r30 = r4
            r31 = r0
            r23 = r1
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.7gy r0 = new X.7gy
            r0.<init>(r4, r2, r8, r9)
            goto L_0x07bb
        L_0x1288:
            r4 = 6
            float[] r10 = new float[r4]
            r4 = 68
            float r4 = X.AnonymousClass7KN.A00(r11, r13, r4, r6)
            r7 = 0
            r10[r7] = r4
            r4 = 42
            float r4 = X.AnonymousClass7KN.A00(r11, r12, r4, r6)
            r10[r6] = r4
            r5 = 2
            r4 = 54
            float r4 = X.AnonymousClass7KN.A00(r11, r13, r4, r7)
            r10[r5] = r4
            r5 = 3
            r4 = 53
            float r4 = X.AnonymousClass7KN.A00(r11, r12, r4, r7)
            r10[r5] = r4
            r5 = 4
            r4 = 52
            float r4 = X.AnonymousClass7KN.A00(r11, r13, r4, r7)
            r10[r5] = r4
            r5 = 5
            r4 = 51
            float r4 = X.AnonymousClass7KN.A00(r11, r12, r4, r7)
            r10[r5] = r4
            goto L_0x1243
        L_0x12c1:
            r4 = 13326(0x340e, float:1.8674E-41)
            if (r0 != r4) goto L_0x12cd
            if (r2 == 0) goto L_0x3288
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x12cd:
            r4 = 13336(0x3418, float:1.8688E-41)
            if (r0 != r4) goto L_0x12f3
            X.L1i r10 = r2.A09()
            r13 = 0
            r11 = r7
            r12 = r3
            r14 = r8
            r15 = r9
            X.7H0 r0 = X.C121977Jb.A00(r10, r11, r12, r13, r14, r15)
            int r5 = r0.A01
            int r4 = r0.A00
            java.lang.Object r1 = r0.A02
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x12f3:
            r4 = 16160(0x3f20, float:2.2645E-41)
            if (r0 != r4) goto L_0x1328
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x1326
            java.lang.Object r0 = A09(r7, r2)
            android.view.View r0 = (android.view.View) r0
            r0.measure(r8, r9)
            int r6 = r0.getMeasuredHeight()
        L_0x130a:
            int r5 = X.AnonymousClass70L.A00(r8)
            int r4 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x1324
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x1324
        L_0x131e:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r5, r6)
            goto L_0x07bb
        L_0x1324:
            r6 = r1
            goto L_0x131e
        L_0x1326:
            r6 = 0
            goto L_0x130a
        L_0x1328:
            r4 = 16260(0x3f84, float:2.2785E-41)
            if (r0 != r4) goto L_0x1369
            r10 = 0
            X.7h3 r0 = A05(r3)
            if (r0 != 0) goto L_0x1344
            java.lang.String r1 = "BKBloksComponentsZoomableBinderUtil"
            java.lang.String r0 = "Zoomable container has empty content. Returning null layout"
            X.C30967GcS.A02(r1, r0)
            r7 = 0
            X.7h1 r0 = new X.7h1
            r6 = r0
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1344:
            X.MeD r11 = r0.ABY(r7, r8, r9)
            r13 = 0
            r10 = r7
            r12 = r0
            r14 = r8
            r15 = r9
            X.7J7 r0 = X.AnonymousClass7J7.A02(r10, r11, r12, r13, r14, r15)
            X.7Di r1 = r0.A02
            com.facebook.rendercore.RenderTreeNode r0 = r1.A04
            android.graphics.Rect r0 = r0.A04
            int r10 = r0.width()
            int r11 = r0.height()
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r7 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1369:
            r4 = 13329(0x3411, float:1.8678E-41)
            if (r0 != r4) goto L_0x15ec
            android.content.Context r0 = r7.A04
            X.MNV r12 = X.M2T.A00(r0)
            r22 = 1
            r0 = r22
            r12.A0a = r0
            r5 = 0
            r12.A0L = r5
            java.lang.String r0 = A0E(r3)
            if (r0 == 0) goto L_0x138e
            int r11 = X.AnonymousClass7Kk.A07(r0)     // Catch:{ 1zB -> 0x328f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            X.AnonymousClass7B1.A02(r12, r0)
            goto L_0x1391
        L_0x138e:
            r11 = 8388611(0x800003, float:1.1754948E-38)
        L_0x1391:
            r0 = 40
            r4 = -1
            int r0 = r3.A0H(r0, r4)
            if (r0 <= r4) goto L_0x13a0
            r12.A0P = r0
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r12.A0U = r0
        L_0x13a0:
            r0 = 44
            java.util.List r4 = r3.A0R(r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x13b4
            X.36v r0 = X.AnonymousClass7B1.A00(r1, r3, r4)
            java.lang.CharSequence r0 = r0.A00
            r12.A0W = r0
        L_0x13b4:
            r0 = 54
            android.util.SparseArray r4 = r3.A04
            java.lang.String r6 = X.C86114wI.A0m(r4, r0)
            if (r6 == 0) goto L_0x13ca
            java.lang.String r0 = "text_first_strong"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x1413
            X.Kst r0 = X.C40592LjV.A03
        L_0x13c8:
            r12.A0V = r0
        L_0x13ca:
            r0 = 53
            X.7h3 r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x13d6
            int r5 = X.C101086Pv.A00(r1, r0, r5)
        L_0x13d6:
            r12.A0L = r5
            r0 = 52
            r10 = 0
            int r0 = r3.A0H(r0, r10)
            r12.A0M = r0
            r0 = 46
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r3.A0H(r0, r6)
            r0 = 48
            int r13 = r3.A0H(r0, r6)
            if (r5 == r6) goto L_0x1411
            if (r13 == r6) goto L_0x1411
            r14 = 1
            android.content.Context r0 = r1.A00
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r0)
            float r6 = r0.density
            float r0 = (float) r5
            float r0 = r0 * r6
            int r5 = java.lang.Math.round(r0)
            float r0 = (float) r13
            float r0 = r0 * r6
            int r0 = java.lang.Math.round(r0)
            r12.A0N = r5
            r12.A0O = r0
        L_0x140c:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 67
            goto L_0x1421
        L_0x1411:
            r14 = 0
            goto L_0x140c
        L_0x1413:
            android.content.Context r0 = r1.A00
            boolean r0 = X.C98926Hl.A00(r0)
            if (r0 == 0) goto L_0x141e
            X.Kst r0 = X.C40592LjV.A02
            goto L_0x13c8
        L_0x141e:
            X.Kst r0 = X.C40592LjV.A01
            goto L_0x13c8
        L_0x1421:
            java.lang.String r0 = X.C86114wI.A0m(r4, r0)     // Catch:{ 1zB -> 0x1433 }
            if (r0 == 0) goto L_0x143b
            float r5 = X.AnonymousClass7Kk.A01(r0)     // Catch:{ 1zB -> 0x1433 }
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x143b
            r12.A0J = r5     // Catch:{ 1zB -> 0x1433 }
            goto L_0x143b
        L_0x1433:
            r13 = move-exception
            java.lang.String r5 = "RichTextBinderUtils"
            java.lang.String r0 = "Error parsing lineHeight for RichText"
            X.C30967GcS.A01(r1, r5, r0, r13, r10)
        L_0x143b:
            r0 = 38
            float r6 = r3.A0G(r0, r6)
            r5 = r14 ^ 1
            r15 = 0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x144c
            r12.A0Z = r5
            r12.A0K = r6
        L_0x144c:
            r0 = 32
            java.util.List r0 = r3.A0R(r0)
            X.36v r21 = X.AnonymousClass7B1.A00(r1, r3, r0)
            r0 = r21
            java.lang.CharSequence r0 = r0.A00
            android.text.SpannableString r20 = android.text.SpannableString.valueOf(r0)
            r0 = 50
            java.lang.Object r0 = A0A(r3, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r10)
            if (r0 == 0) goto L_0x146d
            X.AnonymousClass794.A00()
        L_0x146d:
            X.5fL r2 = (X.C90945fL) r2
            r23 = r7
            r24 = r2
            r25 = r12
            r26 = r20
            r27 = r8
            r28 = r9
            X.7h1 r0 = X.M2P.A01(r23, r24, r25, r26, r27, r28)
            r2 = 140(0x8c, float:1.96E-43)
            X.7h3 r19 = r3.A0K(r2)
            if (r19 == 0) goto L_0x15bc
            r2 = 65
            java.lang.String r5 = X.C86114wI.A0m(r4, r2)
            java.lang.String r2 = "background start padding"
            float r13 = X.AnonymousClass6G3.A00(r1, r5, r2)
            r2 = 63
            java.lang.String r5 = X.C86114wI.A0m(r4, r2)
            java.lang.String r2 = "background end padding"
            float r9 = X.AnonymousClass6G3.A00(r1, r5, r2)
            r2 = 66
            java.lang.String r5 = X.C86114wI.A0m(r4, r2)
            java.lang.String r2 = "background top padding"
            float r8 = X.AnonymousClass6G3.A00(r1, r5, r2)
            r2 = 62
            java.lang.String r5 = X.C86114wI.A0m(r4, r2)
            java.lang.String r2 = "background bottom padding"
            float r6 = X.AnonymousClass6G3.A00(r1, r5, r2)
            r2 = 58
            java.lang.String r4 = X.C86114wI.A0m(r4, r2)
            java.lang.String r2 = "background corner radius"
            float r29 = X.AnonymousClass6G3.A00(r1, r4, r2)
            java.lang.Object r5 = r0.A04
            r5.getClass()
            X.6mk r5 = (X.C111076mk) r5
            int r2 = r0.A00
            r32 = r2
            int r2 = android.view.View.MeasureSpec.getMode(r32)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x14fe
            int r2 = android.view.View.MeasureSpec.getSize(r32)
            int r4 = A01(r5)
            float r14 = (float) r4
            float r14 = r14 + r8
            float r14 = r14 + r6
            float r4 = (float) r2
            float r2 = r4 - r14
            float r2 = r2 / r16
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x14fe
            float r2 = java.lang.Math.max(r15, r2)
            float r4 = java.lang.Math.min(r8, r2)
            float r8 = java.lang.Math.abs(r4)
            float r2 = java.lang.Math.min(r6, r2)
            float r6 = java.lang.Math.abs(r2)
        L_0x14fe:
            int r2 = r0.A02
            r31 = r2
            int r2 = android.view.View.MeasureSpec.getMode(r31)
            if (r2 == 0) goto L_0x1540
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            android.text.Layout r2 = r5.A02
            r23 = r2
            r4 = 0
            r2 = 0
        L_0x1512:
            int r15 = r23.getLineCount()
            if (r4 >= r15) goto L_0x1527
            float r15 = (float) r2
            r2 = r23
            float r2 = r2.getLineWidth(r4)
            float r2 = java.lang.Math.max(r15, r2)
            int r2 = (int) r2
            int r4 = r4 + 1
            goto L_0x1512
        L_0x1527:
            float r4 = (float) r2
            float r4 = r4 + r13
            float r4 = r4 + r9
            int r2 = r14 - r2
            int r2 = r2 >> 1
            float r14 = (float) r14
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x1540
            int r2 = java.lang.Math.max(r10, r2)
            float r2 = (float) r2
            float r13 = java.lang.Math.min(r13, r2)
            float r9 = java.lang.Math.min(r9, r2)
        L_0x1540:
            r17.getClass()
            r2 = r19
            int r30 = X.C101086Pv.A00(r1, r2, r10)
            android.text.Layout r1 = r5.A02
            X.7QM r4 = new X.7QM
            r27 = r8
            r28 = r6
            r23 = r4
            r24 = r1
            r25 = r13
            r26 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            int r5 = r20.length()
            r2 = 18
            r1 = r20
            r1.setSpan(r4, r10, r5, r2)
            r12.A0H = r13
            r12.A0I = r9
            X.M5L r2 = r0.A03
            r2.getClass()
            X.5fL r2 = (X.C90945fL) r2
            r23 = r7
            r24 = r2
            r25 = r12
            r26 = r1
            r27 = r31
            r28 = r32
            X.7h1 r5 = X.M2P.A01(r23, r24, r25, r26, r27, r28)
            java.lang.Object r4 = r5.A04
            r4.getClass()
            X.6mk r4 = (X.C111076mk) r4
            r4.A01 = r8
            r0 = r22
            if (r11 == r0) goto L_0x15de
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r11 == r0) goto L_0x15a4
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r11 != r0) goto L_0x15a6
            int r0 = r5.A01
            float r13 = (float) r0
            android.text.Layout r11 = r4.A02
            if (r11 != 0) goto L_0x15cb
            r1 = 0
        L_0x15a1:
            float r0 = (float) r1
            float r0 = r0 + r9
            float r13 = r13 - r0
        L_0x15a4:
            r4.A00 = r13
        L_0x15a6:
            int r1 = r5.A01
            int r11 = A01(r4)
            float r8 = r8 + r6
            int r0 = (int) r8
            int r11 = r11 + r0
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r7 = r4
            r8 = r31
            r9 = r32
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x15bc:
            java.lang.Object r2 = r0.A04
            r2.getClass()
            X.6mk r2 = (X.C111076mk) r2
            r1 = r21
            java.lang.String r1 = r1.A01
            r2.A05 = r1
            goto L_0x07bb
        L_0x15cb:
            int r7 = r11.getLineCount()
            r1 = 0
        L_0x15d0:
            if (r10 >= r7) goto L_0x15a1
            float r0 = r11.getLineRight(r10)
            int r0 = (int) r0
            int r1 = java.lang.Math.max(r1, r0)
            int r10 = r10 + 1
            goto L_0x15d0
        L_0x15de:
            android.text.Layout r0 = r4.A02
            int r1 = r0.getLineCount()
            r0 = r22
            if (r1 != r0) goto L_0x15a6
            float r13 = r13 + r9
            float r13 = r13 / r16
            goto L_0x15a4
        L_0x15ec:
            r4 = 13335(0x3417, float:1.8686E-41)
            if (r0 != r4) goto L_0x16db
            android.content.Context r0 = r7.A04
            r21 = r0
            X.MNV r12 = X.M2T.A00(r21)
            r20 = 1
            r0 = r20
            r12.A0a = r0
            r13 = 0
            r12.A0L = r13
            java.lang.String r0 = A0E(r3)
            if (r0 == 0) goto L_0x1612
            int r0 = X.AnonymousClass7Kk.A07(r0)     // Catch:{ 1zB -> 0x3295 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass7B1.A02(r12, r0)
        L_0x1612:
            r0 = 38
            r4 = -1
            int r0 = r3.A0H(r0, r4)
            if (r0 <= r4) goto L_0x1621
            r12.A0P = r0
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r12.A0U = r0
        L_0x1621:
            r0 = 51
            java.util.List r4 = r3.A0R(r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x164c
            X.36v r0 = X.AnonymousClass7B1.A00(r1, r3, r4)
            java.lang.CharSequence r0 = r0.A00
        L_0x1633:
            r12.A0W = r0
        L_0x1635:
            r0 = 45
            android.util.SparseArray r14 = r3.A04
            java.lang.String r10 = X.C86114wI.A0m(r14, r0)
            java.lang.String r17 = ""
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L_0x168a
            r0 = 53
            java.lang.String r6 = X.C86114wI.A0m(r14, r0)
            if (r6 == 0) goto L_0x1679
            goto L_0x1657
        L_0x164c:
            r4 = 49
            android.util.SparseArray r0 = r3.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r4)
            if (r0 == 0) goto L_0x1635
            goto L_0x1633
        L_0x1657:
            java.lang.String r4 = "[^0-9.]"
            r0 = r17
            java.lang.String r5 = r10.replaceAll(r4, r0)     // Catch:{ 1zB -> 0x329b }
            int r4 = r5.length()     // Catch:{ 1zB -> 0x329b }
            int r0 = r10.length()     // Catch:{ 1zB -> 0x329b }
            if (r4 == r0) goto L_0x1670
            java.lang.String r4 = "text_size_ignored"
            java.lang.String r0 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.C30967GcS.A02(r4, r0)     // Catch:{ 1zB -> 0x329b }
        L_0x1670:
            float r11 = java.lang.Float.parseFloat(r5)     // Catch:{ 1zB -> 0x329b }
            int r10 = X.AnonymousClass7Kk.A08(r6)     // Catch:{ 1zB -> 0x329b }
            goto L_0x167e
        L_0x1679:
            float r11 = X.AnonymousClass7Kk.A02(r10)     // Catch:{ 1zB -> 0x329b }
            r10 = 2
        L_0x167e:
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r21)
            float r0 = android.util.TypedValue.applyDimension(r10, r11, r0)
            int r0 = (int) r0
            r12.A0R = r0
            goto L_0x168d
        L_0x168a:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1
        L_0x168d:
            r0 = 46
            java.lang.String r4 = X.C86114wI.A0m(r14, r0)
            java.lang.String r15 = X.C18220wO.A0o(r3)
            r6 = 0
            if (r15 == 0) goto L_0x16a6
            X.794 r0 = X.AnonymousClass794.A00()
            X.3TV r0 = r0.A05
            android.content.Context r5 = r1.A00
            android.graphics.Typeface r6 = r0.A01(r5, r15, r13)
        L_0x16a6:
            if (r4 == 0) goto L_0x16c0
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x16c0
            r0 = r21
            android.graphics.Typeface r6 = X.C101096Pw.A00(r0, r6, r4)     // Catch:{ 1zB -> 0x16b5 }
            goto L_0x16c0
        L_0x16b5:
            r16 = move-exception
            java.lang.String r4 = "TextBinderUtils"
            java.lang.String r0 = "Error parsing typeface for Text"
            r5 = r4
            r4 = r16
            X.C30967GcS.A01(r1, r5, r0, r4, r13)
        L_0x16c0:
            if (r15 == 0) goto L_0x16c6
            if (r6 == 0) goto L_0x16c6
            r12.A0T = r6
        L_0x16c6:
            r0 = 59
            java.lang.String r0 = X.C86114wI.A0m(r14, r0)     // Catch:{ 1zB -> 0x21c3 }
            if (r0 == 0) goto L_0x21cb
            float r4 = X.AnonymousClass7Kk.A01(r0)     // Catch:{ 1zB -> 0x21c3 }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x21cb
            r12.A0J = r4     // Catch:{ 1zB -> 0x21c3 }
            goto L_0x21cb
        L_0x16db:
            r4 = 13797(0x35e5, float:1.9334E-41)
            if (r0 != r4) goto L_0x17bc
            r4 = 35
            r0 = 0
            float r16 = r3.A0G(r4, r0)
            java.util.List r6 = r3.A0P()
            r4 = 0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x1715
            java.lang.Object r0 = r6.get(r4)
        L_0x16f3:
            X.7h3 r0 = (X.C127397h3) r0
            X.MeD r0 = r0.ABY(r7, r8, r9)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r1.add(r0)
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            X.7gz r0 = new X.7gz
            r10 = r0
            r11 = r2
            r12 = r1
            r15 = r8
            r16 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x1715:
            r5 = 1
            r15 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x1721
            java.lang.Object r0 = r6.get(r5)
            goto L_0x16f3
        L_0x1721:
            X.7h3 r0 = X.C86154wM.A0Q(r6, r4)
            X.MeD r13 = r0.ABY(r7, r8, r9)
            X.7h3 r0 = X.C86154wM.A0Q(r6, r5)
            X.MeD r11 = r0.ABY(r7, r8, r9)
            int r6 = r13.getWidth()
            float r5 = (float) r6
            int r0 = r11.getWidth()
            int r0 = r0 - r6
            float r0 = (float) r0
            float r0 = r0 * r16
            float r5 = r5 + r0
            int r10 = (int) r5
            int r6 = r13.getHeight()
            float r5 = (float) r6
            int r0 = r11.getHeight()
            int r0 = r0 - r6
            float r0 = (float) r0
            float r0 = r0 * r16
            float r5 = r5 + r0
            int r7 = (int) r5
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r14 = X.AnonymousClass7K7.A04(r1, r3)
            android.util.Pair r14 = (android.util.Pair) r14
            if (r14 == 0) goto L_0x32a1
            r0 = 36
            java.lang.Object r0 = A0A(r3, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r4)
            if (r0 == 0) goto L_0x17b5
            java.lang.Object r0 = r14.first
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.5fM r12 = A07(r1, r0)
            float r15 = r15 - r16
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            X.7h6 r0 = new X.7h6
            r0.<init>()
            X.C86134wK.A1I(r0, r12, r4)
            X.7h0 r5 = new X.7h0
            r5.<init>(r13, r12)
            java.lang.Object r0 = r14.second
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.5fM r4 = A07(r1, r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            X.7h6 r0 = new X.7h6
            r0.<init>()
            X.C86134wK.A1I(r0, r4, r1)
            X.7h0 r0 = new X.7h0
            r0.<init>(r11, r4)
            r6.add(r5)
            r6.add(r0)
        L_0x17a5:
            X.7gz r0 = new X.7gz
            r11 = r0
            r12 = r2
            r13 = r6
            r14 = r10
            r15 = r7
            r16 = r8
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x07bb
        L_0x17b5:
            r6.add(r13)
            r6.add(r11)
            goto L_0x17a5
        L_0x17bc:
            r4 = 14093(0x370d, float:1.9748E-41)
            if (r0 != r4) goto L_0x181e
            r0 = 36
            X.7h3 r5 = r3.A0K(r0)
            if (r5 == 0) goto L_0x32a8
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r0 = 40
            X.7h3 r0 = r3.A0K(r0)
            r1 = 0
            if (r0 == 0) goto L_0x17e8
            X.MeD r11 = r0.ABY(r7, r8, r4)
            r10 = r7
            r12 = r0
            r13 = r1
            r14 = r8
            r15 = r4
            X.7J7 r1 = X.AnonymousClass7J7.A02(r10, r11, r12, r13, r14, r15)
        L_0x17e8:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 == 0) goto L_0x181b
            X.7Di r0 = r1.A02
            int r28 = X.AnonymousClass7Di.A00(r0)
        L_0x17f4:
            int r4 = r4 - r28
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            X.MeD r20 = r5.ABY(r7, r8, r0)
            int r23 = android.view.View.MeasureSpec.getSize(r8)
            int r24 = r20.getHeight()
            int r24 = r24 + r28
            r27 = 0
            X.7h0 r0 = new X.7h0
            r19 = r0
            r21 = r2
            r22 = r1
            r25 = r8
            r26 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x07bb
        L_0x181b:
            r28 = 0
            goto L_0x17f4
        L_0x181e:
            r4 = 16682(0x412a, float:2.3376E-41)
            if (r0 != r4) goto L_0x1861
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            android.content.Context r0 = r7.A04
            android.util.DisplayMetrics r1 = X.C18230wP.A0E(r0)
            X.C04220Ms.A06(r1)
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x185f
            r0 = 52
            float r4 = (float) r0
            int r0 = r1.densityDpi
            float r1 = (float) r0
            r0 = 160(0xa0, float:2.24E-43)
            float r0 = (float) r0
            float r1 = r1 / r0
            int r6 = X.AnonymousClass8bA.A03(r4, r1)
        L_0x1843:
            int r5 = X.AnonymousClass70L.A00(r8)
            int r4 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x185d
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x185d
        L_0x1857:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r5, r6)
            goto L_0x07bb
        L_0x185d:
            r6 = r1
            goto L_0x1857
        L_0x185f:
            r6 = 0
            goto L_0x1843
        L_0x1861:
            r4 = 16278(0x3f96, float:2.281E-41)
            if (r0 != r4) goto L_0x186b
            X.MeD r0 = X.C98546Fz.A00(r7, r2, r3, r8, r9)
            goto L_0x07bb
        L_0x186b:
            r4 = 15981(0x3e6d, float:2.2394E-41)
            if (r0 != r4) goto L_0x1880
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = X.AnonymousClass70L.A01(r0, r8)
            int r0 = X.AnonymousClass70L.A01(r0, r9)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1880:
            r4 = 16111(0x3eef, float:2.2576E-41)
            if (r0 != r4) goto L_0x18db
            r0 = 32
            java.util.List r4 = r3.A0R(r0)
            int r0 = r4.size()
            r7 = 1
            if (r0 > r7) goto L_0x32bb
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x18a4
            r5 = 0
            r6 = 0
            X.7h1 r0 = new X.7h1
            r4 = r0
            r7 = r6
            r8 = r6
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x07bb
        L_0x18a4:
            X.AnonymousClass0SJ.A00(r17)
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r1, r3)
            if (r0 == 0) goto L_0x32b4
            java.lang.String r10 = "Popup does not have an anchor view id"
            r0 = 0
            r4 = 35
            java.lang.String r0 = r3.A0O(r4, r0)     // Catch:{ ClassCastException -> 0x18ba }
            if (r0 != 0) goto L_0x18c9
            goto L_0x32af
        L_0x18ba:
            r0 = 0
            long r5 = r3.A0I(r4, r0)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x18c9
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r10)
            throw r1
        L_0x18c9:
            int[] r12 = new int[]{r8, r9}
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r13 = r8
            r14 = r9
            r15 = r7
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x18db:
            r4 = 16641(0x4101, float:2.3319E-41)
            if (r0 != r4) goto L_0x18ee
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            r10 = 0
            X.7h1 r0 = new X.7h1
            r6 = r0
            r7 = r2
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x18ee:
            r4 = 16688(0x4130, float:2.3385E-41)
            if (r0 != r4) goto L_0x1903
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = X.AnonymousClass70L.A01(r0, r9)
            int r0 = X.AnonymousClass70L.A00(r8)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x1903:
            r4 = 16095(0x3edf, float:2.2554E-41)
            if (r0 != r4) goto L_0x1922
            if (r2 == 0) goto L_0x32c2
            if (r17 == 0) goto L_0x32c2
            r5 = r2
            X.9Ud r5 = (X.AnonymousClass9Ud) r5
            android.content.Context r0 = r7.A04
            android.view.View r4 = r5.A0O(r0)
            r0 = 0
            r5.A0T(r4, r1, r3, r0)
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.7h1 r0 = X.C127377h1.A00(r4, r2, r8, r9)
            goto L_0x07bb
        L_0x1922:
            r4 = 15856(0x3df0, float:2.2219E-41)
            if (r0 != r4) goto L_0x1953
            if (r2 == 0) goto L_0x1941
            if (r17 == 0) goto L_0x1941
            r5 = r2
            X.9Uf r5 = (X.C157879Uf) r5
            android.content.Context r0 = r7.A04
            android.view.View r4 = r5.A0O(r0)
            r0 = 0
            r5.A0U(r4, r1, r0)
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.7h1 r0 = X.C127377h1.A00(r4, r2, r8, r9)
            goto L_0x07bb
        L_0x1941:
            java.lang.String r1 = "CPDP_MVP_HEROCAROUSEL"
            java.lang.String r0 = "CPDPHeroCarouselVideoComponent calculateLayoutForComponent with null renderUnit"
            X.C30967GcS.A02(r1, r0)
            r10 = 0
            X.7h1 r0 = new X.7h1
            r6 = r0
            r7 = r2
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1953:
            r4 = 15894(0x3e16, float:2.2272E-41)
            if (r0 != r4) goto L_0x1976
            if (r2 == 0) goto L_0x32c9
            if (r17 == 0) goto L_0x32c9
            boolean r0 = r2 instanceof X.C157889Ug
            if (r0 == 0) goto L_0x32c9
            r4 = r2
            X.9Ug r4 = (X.C157889Ug) r4
            android.content.Context r0 = r7.A04
            android.view.View r1 = r4.A0O(r0)
            r0 = 0
            r4.A0b(r0)
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.7h1 r0 = X.C127377h1.A00(r1, r2, r8, r9)
            goto L_0x07bb
        L_0x1976:
            r4 = 16068(0x3ec4, float:2.2516E-41)
            if (r0 != r4) goto L_0x19a8
            if (r2 == 0) goto L_0x32d0
            if (r17 == 0) goto L_0x32d0
            boolean r0 = r2 instanceof X.C95225zf
            if (r0 == 0) goto L_0x32d0
            r4 = r2
            X.5fQ r4 = (X.C90995fQ) r4
            android.content.Context r0 = r7.A04
            android.view.View r4 = r4.A0O(r0)
            X.C95225zf.A00(r4, r1, r3)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x199e
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = X.C86134wK.A04(r0)
        L_0x199e:
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.7h1 r0 = X.C127377h1.A00(r4, r2, r8, r9)
            goto L_0x07bb
        L_0x19a8:
            r4 = 16534(0x4096, float:2.3169E-41)
            if (r0 != r4) goto L_0x19ba
            int r1 = X.AnonymousClass70L.A00(r8)
            int r0 = X.AnonymousClass70L.A00(r9)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x19ba:
            r4 = 15753(0x3d89, float:2.2075E-41)
            if (r0 != r4) goto L_0x19e0
            X.AnonymousClass3RS.A01 = r55
            X.AnonymousClass7GY.A02 = r55
            r0 = 44
            X.7h3 r0 = r3.A0K(r0)
            X.AnonymousClass7GY.A03 = r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = java.lang.Math.min(r1, r0)
            X.7h1 r0 = new X.7h1
            r6 = r0
            r7 = r2
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x19e0:
            r4 = 16467(0x4053, float:2.3075E-41)
            if (r0 != r4) goto L_0x1a06
            r5 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0 = 2
            android.util.SparseArray r4 = r3.A04
            r4.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 3
            r4.put(r0, r1)
            int r1 = X.AnonymousClass70L.A00(r8)
            r0 = 0
            int r0 = r3.A0H(r5, r0)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1a06:
            r4 = 16411(0x401b, float:2.2997E-41)
            if (r0 != r4) goto L_0x1a63
            r0 = 0
            if (r2 == 0) goto L_0x1a61
            X.L1i r5 = r2.A09()
            if (r5 == 0) goto L_0x1a61
            android.content.Context r4 = r7.A04
            java.lang.Object r5 = r5.AFU(r4)
        L_0x1a19:
            r4 = 1252(0x4e4, float:1.754E-42)
            java.lang.String r4 = X.C18170wI.A00(r4)
            X.C04220Ms.A0C(r5, r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r5
            r4 = 36
            X.7h3 r10 = r3.A0K(r4)
            r4 = 38
            X.7h3 r7 = r3.A0K(r4)
            if (r10 == 0) goto L_0x1a5f
            r6 = 41
            android.util.SparseArray r4 = r10.A04
            java.lang.String r4 = X.C86114wI.A0m(r4, r6)
        L_0x1a3a:
            r5.setPrimaryActionText(r4)
            if (r7 == 0) goto L_0x1a47
            r4 = 41
            android.util.SparseArray r0 = r7.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r4)
        L_0x1a47:
            r5.setSecondaryActionText(r0)
            r0 = 35
            java.util.List r0 = r3.A0Q(r0)
            X.36v r0 = X.AnonymousClass7B1.A00(r1, r3, r0)
            java.lang.CharSequence r0 = r0.A00
            r5.setFooterText(r0)
            X.7h1 r0 = X.C127377h1.A00(r5, r2, r8, r9)
            goto L_0x07bb
        L_0x1a5f:
            r4 = r0
            goto L_0x1a3a
        L_0x1a61:
            r5 = r0
            goto L_0x1a19
        L_0x1a63:
            r4 = 16355(0x3fe3, float:2.2918E-41)
            if (r0 != r4) goto L_0x1a81
            if (r2 == 0) goto L_0x32d7
            java.lang.Object r1 = A09(r7, r2)
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.I17.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            X.C29116FiJ.A00(r3, r1)
            X.7h1 r0 = X.C127377h1.A00(r1, r2, r8, r9)
            goto L_0x07bb
        L_0x1a81:
            r4 = 16535(0x4097, float:2.317E-41)
            if (r0 != r4) goto L_0x1a9b
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            android.content.Context r4 = r7.A04
            r0 = 24
            int r1 = X.C18240wQ.A01(r4, r0)
            int r0 = X.C18240wQ.A01(r4, r0)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1a9b:
            r4 = 16383(0x3fff, float:2.2957E-41)
            if (r0 != r4) goto L_0x1b53
            r12 = 0
            r11 = 1
            if (r2 == 0) goto L_0x32de
            X.L1i r0 = r2.A09()
            android.content.Context r6 = r7.A04
            java.lang.Object r5 = r0.AFU(r6)
            r0 = 33
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C04220Ms.A0C(r5, r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r5 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r5
            java.lang.String r1 = A0E(r3)
            java.lang.String r0 = "large"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x1b4f
            X.23e r0 = X.C308423e.LARGE
        L_0x1ac6:
            r5.setSize(r0)
            r1 = 43
            android.util.SparseArray r0 = r3.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r1)
            r5.setLabel(r0)
            X.C04220Ms.A06(r6)
            X.AnonymousClass2BX.A00(r6, r3, r5)
            r5.measure(r8, r9)
            r10 = 2
            int r0 = r5.getMeasuredWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r1, r0}
            r1 = 46
            X.7h3 r0 = r3.A0K(r1)
            if (r0 != 0) goto L_0x1b02
            r1 = 45
            X.7h3 r0 = r3.A0K(r1)
            if (r0 == 0) goto L_0x1b3d
        L_0x1b02:
            X.7h3 r0 = r3.A0K(r1)
            if (r0 == 0) goto L_0x1b3d
            java.lang.String r7 = X.C18230wP.A0o(r0)
            if (r7 == 0) goto L_0x1b3d
            java.lang.String r0 = "_"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 3
            java.util.List r0 = X.AnonymousClass8bP.A0f(r7, r1, r0, r10)
            if (r0 == 0) goto L_0x1b3d
            float r1 = r5.getLabelWidth()
            java.lang.String r0 = X.C18190wL.A0p(r0, r10)
            int r0 = java.lang.Integer.parseInt(r0)
            float r0 = X.C09860go.A03(r6, r0)
            float r1 = r1 + r0
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r1, r0}
        L_0x1b3d:
            r0 = r4[r12]
            int r1 = r0.intValue()
            r0 = r4[r11]
            int r0 = r0.intValue()
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1b4f:
            X.23e r0 = X.C308423e.SMALL
            goto L_0x1ac6
        L_0x1b53:
            r4 = 16536(0x4098, float:2.3172E-41)
            if (r0 != r4) goto L_0x1b6d
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            android.content.Context r4 = r7.A04
            r0 = 24
            int r1 = X.C18240wQ.A01(r4, r0)
            int r0 = X.C18240wQ.A01(r4, r0)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1b6d:
            r4 = 16390(0x4006, float:2.2967E-41)
            if (r0 != r4) goto L_0x1b87
            if (r2 == 0) goto L_0x32e5
            java.lang.Object r4 = A09(r7, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.textcell.IgdsListCell"
            X.C04220Ms.A0C(r4, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            X.AnonymousClass2BY.A00(r1, r3, r4)
            X.7h1 r0 = X.C127377h1.A00(r4, r2, r8, r9)
            goto L_0x07bb
        L_0x1b87:
            r4 = 16218(0x3f5a, float:2.2726E-41)
            if (r0 != r4) goto L_0x1bb2
            if (r2 == 0) goto L_0x32ec
            java.lang.Object r4 = A09(r7, r2)
            r0 = 3
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r4, r0)
            android.view.View r4 = (android.view.View) r4
            r4.measure(r8, r9)
            r1 = 31
            int r0 = r4.getMeasuredHeight()
            int r1 = r3.A0H(r1, r0)
            int r0 = r4.getMeasuredWidth()
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x1bb2:
            r4 = 13922(0x3662, float:1.9509E-41)
            if (r0 != r4) goto L_0x1bd8
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x1bd3
            r0 = 0
        L_0x1bc1:
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r1 != 0) goto L_0x1bce
            r1 = 0
        L_0x1bc8:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x1bce:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x1bc8
        L_0x1bd3:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1bc1
        L_0x1bd8:
            r4 = 15778(0x3da2, float:2.211E-41)
            if (r0 != r4) goto L_0x1bfa
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x1bf5
            r0 = 0
        L_0x1be3:
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r1 != 0) goto L_0x1bf0
            r1 = 0
        L_0x1bea:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x1bf0:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x1bea
        L_0x1bf5:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1be3
        L_0x1bfa:
            r4 = 15728(0x3d70, float:2.204E-41)
            if (r0 != r4) goto L_0x1c28
            X.7h3 r0 = A05(r3)
            if (r0 != 0) goto L_0x1c13
            r10 = 24
        L_0x1c06:
            X.7h1 r0 = new X.7h1
            r4 = r0
            r5 = r2
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x07bb
        L_0x1c13:
            r1 = 36
            android.util.SparseArray r0 = r0.A04     // Catch:{ 1zB -> 0x1c25 }
            java.lang.String r1 = X.C86114wI.A0m(r0, r1)     // Catch:{ 1zB -> 0x1c25 }
            r0 = 1103101952(0x41c00000, float:24.0)
            if (r1 == 0) goto L_0x1c23
            float r0 = X.AnonymousClass7Kk.A01(r1)     // Catch:{ 1zB -> 0x1c25 }
        L_0x1c23:
            int r10 = (int) r0     // Catch:{ 1zB -> 0x1c25 }
            goto L_0x1c06
        L_0x1c25:
            r10 = 24
            goto L_0x1c06
        L_0x1c28:
            r4 = 16675(0x4123, float:2.3367E-41)
            if (r0 != r4) goto L_0x1c5f
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            if (r17 == 0) goto L_0x3301
            r0 = 36
            X.7h3 r10 = r3.A0K(r0)
            if (r10 == 0) goto L_0x32fa
            r4 = 2131297470(0x7f0904be, float:1.8212886E38)
            android.util.SparseArray r0 = r1.A01
            java.lang.Object r1 = r0.get(r4)
            X.4uA r1 = (X.C84884uA) r1
            boolean r0 = r1 instanceof X.C81874oX
            if (r0 == 0) goto L_0x264d
            X.7h3 r15 = A05(r3)
            if (r15 == 0) goto L_0x32f3
            X.4oX r1 = (X.C81874oX) r1
            r11 = r1
            r12 = r7
            r13 = r2
            r14 = r10
            r16 = r8
            r17 = r9
            X.MeD r0 = r11.BaU(r12, r13, r14, r15, r16, r17)
            goto L_0x07bb
        L_0x1c5f:
            r4 = 13334(0x3416, float:1.8685E-41)
            if (r0 != r4) goto L_0x1c7c
            if (r2 == 0) goto L_0x3306
            java.lang.Object r0 = A09(r7, r2)
            X.8mC r0 = (X.C146408mC) r0
            r0.measure(r8, r9)
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1c7c:
            r4 = 16079(0x3ecf, float:2.2531E-41)
            if (r0 != r4) goto L_0x1cc6
            r6 = 0
            r0 = 40
            X.7h3 r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x330d
            X.MeD r11 = r0.ABY(r7, r8, r9)
            r13 = 0
            r10 = r7
            r12 = r0
            r14 = r8
            r15 = r9
            X.7J7 r5 = X.AnonymousClass7J7.A02(r10, r11, r12, r13, r14, r15)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x1cc1
            X.7Di r0 = r5.A02
            int r1 = X.AnonymousClass7Di.A01(r0)
        L_0x1ca2:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x203c
            X.7Di r0 = r5.A02
            int r4 = X.AnonymousClass7Di.A00(r0)
        L_0x1cae:
            int[] r0 = new int[]{r1, r4}
            r10 = r0[r6]
            X.7Di r1 = r5.A02
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r7 = r1
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1cc1:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1ca2
        L_0x1cc6:
            r4 = 16265(0x3f89, float:2.2792E-41)
            if (r0 != r4) goto L_0x1cd4
            r1 = 0
            r0 = 1
            if (r17 != 0) goto L_0x2042
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1cd4:
            r4 = 13389(0x344d, float:1.8762E-41)
            if (r0 != r4) goto L_0x1ce2
            if (r17 != 0) goto L_0x2071
            r1 = 0
            r0 = 1
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1ce2:
            r4 = 13392(0x3450, float:1.8766E-41)
            if (r0 != r4) goto L_0x1cf4
            r1 = 46
            android.util.SparseArray r0 = r3.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r1)
            X.7h1 r0 = X.C117996za.A00(r2, r0, r8, r9)
            goto L_0x07bb
        L_0x1cf4:
            r4 = 16166(0x3f26, float:2.2653E-41)
            if (r0 != r4) goto L_0x1cff
            r0 = 0
            X.7h1 r0 = X.C117996za.A00(r2, r0, r8, r9)
            goto L_0x07bb
        L_0x1cff:
            r4 = 15768(0x3d98, float:2.2096E-41)
            if (r0 != r4) goto L_0x1d50
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r7 = X.AnonymousClass70L.A01(r0, r8)
            int r6 = X.AnonymousClass70L.A01(r0, r9)
            r0 = 44
            java.util.List r0 = r3.A0Q(r0)
            java.util.List r0 = X.AnonymousClass6OH.A00(r0)
            java.util.Iterator r10 = r0.iterator()
            r5 = 1071877689(0x3fe38e39, float:1.7777778)
        L_0x1d1f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1d3d
            java.lang.Object r4 = r10.next()
            com.instagram.model.mediasize.VideoUrlImpl r4 = (com.instagram.model.mediasize.VideoUrlImpl) r4
            int r1 = r4.A03
            r0 = -1
            if (r1 == r0) goto L_0x1d1f
            if (r1 == r0) goto L_0x1d1f
            float r5 = (float) r1
            int r0 = r4.A01
            float r0 = (float) r0
            float r5 = r5 / r0
            int r1 = r4.A02
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x1d1f
        L_0x1d3d:
            float r4 = (float) r7
            float r1 = (float) r6
            float r0 = r4 / r1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x1d4d
            float r4 = r4 / r5
            int r6 = (int) r4
        L_0x1d47:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r7, r6)
            goto L_0x07bb
        L_0x1d4d:
            float r1 = r1 * r5
            int r7 = (int) r1
            goto L_0x1d47
        L_0x1d50:
            r4 = 15969(0x3e61, float:2.2377E-41)
            if (r0 == r4) goto L_0x2a3f
            r4 = 13894(0x3646, float:1.947E-41)
            if (r0 != r4) goto L_0x1d7d
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r4 = 0
            if (r0 != 0) goto L_0x1d78
            r1 = 0
        L_0x1d60:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == 0) goto L_0x1d6a
            int r4 = android.view.View.MeasureSpec.getSize(r9)
        L_0x1d6a:
            int r10 = java.lang.Math.min(r1, r4)
            X.7h1 r0 = new X.7h1
            r6 = r0
            r7 = r2
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1d78:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1d60
        L_0x1d7d:
            r4 = 13616(0x3530, float:1.908E-41)
            if (r0 != r4) goto L_0x1d89
            if (r2 == 0) goto L_0x3312
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x1d89:
            r4 = 13775(0x35cf, float:1.9303E-41)
            if (r0 != r4) goto L_0x1d93
            X.7h1 r0 = A03(r2, r8, r9)
            goto L_0x07bb
        L_0x1d93:
            r4 = 13907(0x3653, float:1.9488E-41)
            if (r0 != r4) goto L_0x1d9d
            X.7h1 r0 = A03(r2, r8, r9)
            goto L_0x07bb
        L_0x1d9d:
            r4 = 13745(0x35b1, float:1.9261E-41)
            if (r0 != r4) goto L_0x1da7
            X.7h1 r0 = A03(r2, r8, r9)
            goto L_0x07bb
        L_0x1da7:
            r4 = 13375(0x343f, float:1.8742E-41)
            if (r0 != r4) goto L_0x1dbb
            int[] r4 = com.instagram.ui.widget.edittext.ConfirmationCodeEditText.A03(r8, r9)
            r0 = 0
            r1 = r4[r0]
            r0 = 1
            r0 = r4[r0]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1dbb:
            r4 = 13379(0x3443, float:1.8748E-41)
            if (r0 != r4) goto L_0x1e12
            if (r2 == 0) goto L_0x3319
            java.lang.Object r5 = A09(r7, r2)
            com.instagram.hashtag.ui.HashtagFollowButton r5 = (com.instagram.hashtag.ui.HashtagFollowButton) r5
            r0 = 31
            android.util.SparseArray r1 = r3.A04
            java.lang.Object r4 = r1.get(r0)
            com.instagram.model.hashtag.Hashtag r4 = (com.instagram.model.hashtag.Hashtag) r4
            if (r4 != 0) goto L_0x1de1
            r0 = 35
            java.lang.Object r0 = r1.get(r0)
            X.6ds r0 = (X.C105716ds) r0
            if (r0 == 0) goto L_0x1e0a
            com.instagram.model.hashtag.Hashtag r4 = r0.A00
            if (r4 == 0) goto L_0x1e0a
        L_0x1de1:
            X.8jA r0 = r5.A00
            if (r0 == 0) goto L_0x1de8
            r0.C1E(r4)
        L_0x1de8:
            boolean r1 = X.C19272Atb.A02(r4)
            java.lang.String r0 = r4.A0C
            if (r0 != 0) goto L_0x1df2
            java.lang.String r0 = ""
        L_0x1df2:
            com.instagram.hashtag.ui.HashtagFollowButton.A00(r5, r0, r1)
            r0 = 0
            r5.setOnClickListener(r0)
            r5.measure(r8, r9)
        L_0x1dfc:
            int r1 = r5.getMeasuredWidth()
            int r0 = r5.getMeasuredHeight()
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1e0a:
            java.lang.String r1 = "HashtagFollowButtonBinderUtils"
            java.lang.String r0 = "Hashtag is required to render hashtag follow button properly"
            X.C30967GcS.A02(r1, r0)
            goto L_0x1dfc
        L_0x1e12:
            r4 = 16122(0x3efa, float:2.2592E-41)
            if (r0 == r4) goto L_0x2a3f
            r4 = 13533(0x34dd, float:1.8964E-41)
            if (r0 != r4) goto L_0x1e4f
            int r4 = X.AnonymousClass70L.A00(r8)
            r10 = 0
            int r0 = X.AnonymousClass70L.A00(r9)
            r6 = 1
            int[] r5 = new int[]{r4, r0}
            if (r0 != 0) goto L_0x1e39
            android.content.Context r0 = r7.A04
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5[r6] = r0
        L_0x1e39:
            r17.getClass()
            X.6mn r4 = new X.6mn
            r4.<init>(r1, r3)
            r10 = r5[r10]
            r11 = r5[r6]
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1e4f:
            r4 = 13780(0x35d4, float:1.931E-41)
            if (r0 != r4) goto L_0x1e5b
            if (r2 == 0) goto L_0x3320
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x1e5b:
            r4 = 13636(0x3544, float:1.9108E-41)
            if (r0 != r4) goto L_0x1e70
            r1 = 31
            r0 = 0
            int r1 = r3.A0H(r1, r0)
            int r0 = X.AnonymousClass70L.A00(r8)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x1e70:
            r4 = 13697(0x3581, float:1.9194E-41)
            if (r0 != r4) goto L_0x1e7c
            if (r2 == 0) goto L_0x3327
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x1e7c:
            r4 = 14045(0x36dd, float:1.9681E-41)
            if (r0 == r4) goto L_0x2a06
            r4 = 14041(0x36d9, float:1.9676E-41)
            if (r0 == r4) goto L_0x2a06
            r4 = 13982(0x369e, float:1.9593E-41)
            if (r0 != r4) goto L_0x1ecd
            r4 = 35
            X.7h3 r10 = r3.A0K(r4)
            if (r10 == 0) goto L_0x332e
            r0 = 36
            X.7h3 r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x264d
            X.7h3 r0 = X.C32292Bd.A00(r0)
            if (r0 == 0) goto L_0x264d
            X.7h3 r6 = r0.A0K(r4)
            if (r6 == 0) goto L_0x264d
            android.content.Context r5 = r7.A04
            X.M4z[] r0 = r7.A06
            X.7h2 r4 = new X.7h2
            r4.<init>(r5, r1, r6, r0)
            X.MeD r6 = r10.ABY(r7, r8, r9)
            int r9 = r6.getWidth()
            int r10 = r6.getHeight()
            int r11 = r6.BMC()
            int r12 = r6.Aml()
            r13 = 0
            X.7h0 r0 = new X.7h0
            r5 = r0
            r7 = r2
            r8 = r4
            r14 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x07bb
        L_0x1ecd:
            r4 = 13393(0x3451, float:1.8768E-41)
            if (r0 == r4) goto L_0x2a3f
            r4 = 14054(0x36e6, float:1.9694E-41)
            if (r0 == r4) goto L_0x2a3f
            r4 = 13376(0x3440, float:1.8744E-41)
            if (r0 != r4) goto L_0x1f3c
            r10 = 0
            if (r2 == 0) goto L_0x333c
            java.lang.Object r5 = A09(r7, r2)
            r0 = 96
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r5, r0)
            com.instagram.user.follow.FollowButton r5 = (com.instagram.user.follow.FollowButton) r5
            X.AnonymousClass7GR.A01(r3, r5)
            r0 = 38
            java.lang.Object r0 = A0A(r3, r0)
            X.74x r0 = (X.C1193774x) r0
            if (r17 == 0) goto L_0x3335
            X.0i6 r6 = X.C63913ic.A0E(r1)
            X.C18200wM.A1R(r6)
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            if (r0 == 0) goto L_0x1f28
            com.instagram.user.model.User r4 = r0.A00
            if (r4 == 0) goto L_0x1f28
        L_0x1f07:
            X.Ctp r0 = X.C23527Ctp.A00(r6)
            X.D0g r1 = r0.A0L(r4)
            X.C04220Ms.A06(r1)
            X.D0g r0 = X.C23894D0g.FollowStatusUnknown
            if (r1 != r0) goto L_0x1f1d
            X.Drj r0 = X.C37088JkK.A00(r6)
            r0.A0C(r4)
        L_0x1f1d:
            X.DvL r0 = r5.A03
            r0.A05(r6, r4)
            X.7h1 r0 = X.C127377h1.A00(r5, r2, r8, r9)
            goto L_0x07bb
        L_0x1f28:
            X.Dnj r4 = X.AnonymousClass6VR.A00(r6)
            r1 = 41
            java.lang.String r0 = ""
            java.lang.String r0 = r3.A0O(r1, r0)
            com.instagram.user.model.User r4 = r4.A03(r0)
            if (r4 != 0) goto L_0x1f07
            goto L_0x1c06
        L_0x1f3c:
            r4 = 13377(0x3441, float:1.8745E-41)
            if (r0 != r4) goto L_0x1f4e
            int r1 = X.AnonymousClass70L.A00(r8)
            int r0 = X.AnonymousClass70L.A00(r9)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1f4e:
            r4 = 13378(0x3442, float:1.8747E-41)
            if (r0 != r4) goto L_0x1f64
            android.content.Context r5 = r7.A04
            X.MNV r12 = X.M2T.A00(r5)
            r6 = 1
            r12.A0a = r6
            java.lang.String r0 = A0E(r3)
            if (r0 == 0) goto L_0x20e8
            r10 = 2
            goto L_0x20d9
        L_0x1f64:
            r4 = 15892(0x3e14, float:2.227E-41)
            if (r0 != r4) goto L_0x1f82
            android.content.Context r0 = r7.A04
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131165393(0x7f0700d1, float:1.7945002E38)
            int r1 = r4.getDimensionPixelSize(r0)
            r0 = 2131165337(0x7f070099, float:1.7944888E38)
            int r0 = r4.getDimensionPixelSize(r0)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x1f82:
            r4 = 13380(0x3444, float:1.875E-41)
            if (r0 != r4) goto L_0x1fa7
            java.lang.String r0 = A0E(r3)
            int r5 = X.AnonymousClass6O9.A00(r0, r8)
            r4 = 0
            java.lang.String r0 = X.C18220wO.A0o(r3)
            int r1 = X.AnonymousClass6O9.A00(r0, r9)
            int[] r7 = new int[]{r5, r1}
            r10 = r7[r4]
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r11 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x1fa7:
            r4 = 13323(0x340b, float:1.867E-41)
            if (r0 != r4) goto L_0x1fcb
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r5 = X.AnonymousClass70L.A01(r0, r8)
            int r4 = X.AnonymousClass70L.A01(r0, r9)
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r0, r0, r5, r4)
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x1fcb:
            r4 = 13399(0x3457, float:1.8776E-41)
            if (r0 != r4) goto L_0x2001
            int r4 = X.AnonymousClass70L.A00(r8)
            r10 = 0
            int r0 = X.AnonymousClass70L.A00(r9)
            r6 = 1
            int[] r5 = new int[]{r4, r0}
            if (r0 != 0) goto L_0x1fee
            android.content.Context r0 = r7.A04
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5[r6] = r0
        L_0x1fee:
            X.6le r4 = new X.6le
            r4.<init>(r1, r3)
            r10 = r5[r10]
            r11 = r5[r6]
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x2001:
            r4 = 13327(0x340f, float:1.8675E-41)
            if (r0 != r4) goto L_0x227b
            r0 = 35
            java.lang.Object r0 = A0A(r3, r0)
            X.7h3 r0 = (X.C127397h3) r0
            if (r0 == 0) goto L_0x3367
            X.MeD r11 = r0.ABY(r7, r8, r9)
            r13 = 0
            r10 = r7
            r12 = r0
            r14 = r8
            r15 = r9
            X.7J7 r5 = X.AnonymousClass7J7.A02(r10, r11, r12, r13, r14, r15)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x2037
            X.7Di r0 = r5.A02
            int r1 = X.AnonymousClass7Di.A01(r0)
        L_0x2028:
            r6 = 0
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x203c
            X.7Di r0 = r5.A02
            int r4 = X.AnonymousClass7Di.A00(r0)
            goto L_0x1cae
        L_0x2037:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x2028
        L_0x203c:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x1cae
        L_0x2042:
            android.content.Context r0 = r7.A04
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r0)
            float r5 = r0.density
            r4 = 44
            int r0 = r3.A0H(r4, r1)
            float r0 = (float) r0
            float r0 = r0 * r5
            int r1 = (int) r0
            r0 = 43
            int r0 = r3.A0H(r0, r4)
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = (int) r0
            if (r1 != 0) goto L_0x206c
            int r1 = X.AnonymousClass70L.A00(r8)
        L_0x2062:
            int r0 = X.AnonymousClass70L.A01(r0, r9)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x206c:
            int r1 = X.AnonymousClass70L.A01(r1, r8)
            goto L_0x2062
        L_0x2071:
            r0 = 2
            int[] r5 = new int[r0]
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r4 = 1
            r6 = 0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x20a6
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r1) goto L_0x20a6
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x2090
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            r5[r6] = r0
        L_0x2090:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r1) goto L_0x209c
            int r0 = android.view.View.MeasureSpec.getSize(r9)
        L_0x209a:
            r5[r4] = r0
        L_0x209c:
            r1 = r5[r6]
            r0 = r5[r4]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x20a6:
            r1 = 35
            java.lang.String r0 = "loading"
            java.lang.String r0 = r3.A0O(r1, r0)
            X.69F r0 = X.AnonymousClass6OE.A00(r0)
            android.content.Context r1 = r7.A04
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x20d0
            if (r0 != r4) goto L_0x20d4
            r0 = 2131233290(0x7f080a0a, float:1.8082713E38)
        L_0x20bf:
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 == 0) goto L_0x20d4
            int r0 = r1.getIntrinsicWidth()
            r5[r6] = r0
            int r0 = r1.getIntrinsicHeight()
            goto L_0x209a
        L_0x20d0:
            r0 = 2131233917(0x7f080c7d, float:1.8083985E38)
            goto L_0x20bf
        L_0x20d4:
            r5[r6] = r6
            r5[r4] = r4
            goto L_0x209c
        L_0x20d9:
            float r4 = X.AnonymousClass7Kk.A02(r0)     // Catch:{ 1zB -> 0x3343 }
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r5)     // Catch:{ 1zB -> 0x3343 }
            float r0 = android.util.TypedValue.applyDimension(r10, r4, r0)     // Catch:{ 1zB -> 0x3343 }
            int r0 = (int) r0     // Catch:{ 1zB -> 0x3343 }
            r12.A0R = r0     // Catch:{ 1zB -> 0x3343 }
        L_0x20e8:
            java.lang.String r10 = X.C18220wO.A0o(r3)
            if (r10 == 0) goto L_0x211e
            java.lang.String r0 = "AvenyT"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x2106
            X.0f8 r0 = X.C09250f7.A05
            X.0f7 r4 = r0.A00(r5)
            X.0fG r0 = X.C09340fG.A0N
            android.graphics.Typeface r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x2106
            r12.A0T = r0
        L_0x2106:
            java.lang.String r0 = "InstagramSansCondensed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x211e
            X.0f8 r0 = X.C09250f7.A05
            X.0f7 r4 = r0.A00(r5)
            X.0fG r0 = X.C09340fG.A0N
            android.graphics.Typeface r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x211e
            r12.A0T = r0
        L_0x211e:
            java.lang.String r0 = A0D(r3)
            if (r0 == 0) goto L_0x213a
            int r4 = X.AnonymousClass7Kk.A07(r0)     // Catch:{ 1zB -> 0x3349 }
            if (r4 == r6) goto L_0x2133
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r0) goto L_0x2130
            goto L_0x2136
        L_0x2130:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ 1zB -> 0x3349 }
            goto L_0x2138
        L_0x2133:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ 1zB -> 0x3349 }
            goto L_0x2138
        L_0x2136:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ 1zB -> 0x3349 }
        L_0x2138:
            r12.A0X = r0     // Catch:{ 1zB -> 0x3349 }
        L_0x213a:
            r17.getClass()
            android.util.DisplayMetrics r10 = X.C18230wP.A0E(r5)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            int r5 = r14.length()
            java.lang.String r0 = A0C(r3)
            if (r0 == 0) goto L_0x2153
            r14.append(r0)
        L_0x2153:
            int r4 = r14.length()
            java.lang.String r0 = A0E(r3)
            r11 = 0
            if (r0 == 0) goto L_0x2170
            float r6 = X.AnonymousClass7Kk.A02(r0)     // Catch:{ 1zB -> 0x334f }
            r0 = 2
            float r0 = android.util.TypedValue.applyDimension(r0, r6, r10)     // Catch:{ 1zB -> 0x334f }
            int r6 = (int) r0     // Catch:{ 1zB -> 0x334f }
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan     // Catch:{ 1zB -> 0x334f }
            r0.<init>(r6)     // Catch:{ 1zB -> 0x334f }
            r14.setSpan(r0, r5, r4, r11)     // Catch:{ 1zB -> 0x334f }
        L_0x2170:
            r6 = 43
            android.util.SparseArray r0 = r3.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r6)
            if (r0 == 0) goto L_0x2186
            int r6 = X.AnonymousClass7Kk.A09(r0)     // Catch:{ 1zB -> 0x3355 }
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan     // Catch:{ 1zB -> 0x3355 }
            r0.<init>(r6)     // Catch:{ 1zB -> 0x3355 }
            r14.setSpan(r0, r5, r4, r11)     // Catch:{ 1zB -> 0x3355 }
        L_0x2186:
            r0 = 36
            java.util.List r10 = r3.A0Q(r0)
            java.lang.String r0 = A0B(r3)
            if (r10 == 0) goto L_0x2251
            if (r0 == 0) goto L_0x2251
            android.graphics.drawable.GradientDrawable$Orientation r6 = X.AnonymousClass7Kk.A0A(r0)     // Catch:{ 1zB -> 0x335b }
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ 1zB -> 0x335b }
            if (r6 != r0) goto L_0x2251
            int r0 = r10.size()     // Catch:{ 1zB -> 0x335b }
            int[] r6 = new int[r0]     // Catch:{ 1zB -> 0x335b }
        L_0x21a2:
            int r0 = r10.size()     // Catch:{ 1zB -> 0x335b }
            if (r11 >= r0) goto L_0x21b6
            X.7h3 r13 = X.C86154wM.A0Q(r10, r11)     // Catch:{ 1zB -> 0x335b }
            r0 = 0
            int r0 = X.C101086Pv.A00(r1, r13, r0)     // Catch:{ 1zB -> 0x335b }
            r6[r11] = r0     // Catch:{ 1zB -> 0x335b }
            int r11 = r11 + 1
            goto L_0x21a2
        L_0x21b6:
            r0 = 0
            X.7QK r1 = new X.7QK     // Catch:{ 1zB -> 0x335b }
            r1.<init>(r0, r6)     // Catch:{ 1zB -> 0x335b }
            r0 = 18
            r14.setSpan(r1, r5, r4, r0)     // Catch:{ 1zB -> 0x335b }
            goto L_0x2251
        L_0x21c3:
            r0 = move-exception
            java.lang.String r5 = "TextBinderUtils"
            java.lang.String r4 = "Error parsing lineHeight for Text"
            X.C30967GcS.A01(r1, r5, r4, r0, r13)
        L_0x21cb:
            r4 = 36
            r0 = r19
            float r4 = r3.A0G(r4, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x21de
            r0 = r20
            r12.A0Z = r0
            r12.A0K = r4
        L_0x21de:
            r0 = 44
            X.7h3 r4 = r3.A0K(r0)
            if (r4 == 0) goto L_0x2271
            X.794 r0 = X.AnonymousClass794.A00()
            X.77G r0 = r0.A08
            java.lang.CharSequence r0 = r0.A00(r4)
        L_0x21f0:
            android.util.DisplayMetrics r5 = X.C18230wP.A0E(r21)
            r4 = 48
            X.7h3 r4 = r3.A0K(r4)
            if (r4 == 0) goto L_0x225d
            int r1 = X.C101086Pv.A00(r1, r4, r13)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
        L_0x2204:
            r1 = 50
            java.lang.Object r1 = A0A(r3, r1)
            boolean r16 = X.AnonymousClass2LL.A00(r1, r13)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            int r15 = r14.length()
            r14.append(r0)
            int r4 = r14.length()
            if (r17 == 0) goto L_0x222c
            int r1 = r17.intValue()
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r14.setSpan(r0, r15, r4, r13)
        L_0x222c:
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x223d
            float r0 = android.util.TypedValue.applyDimension(r10, r11, r5)
            int r1 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r1)
            r14.setSpan(r0, r15, r4, r13)
        L_0x223d:
            if (r6 == 0) goto L_0x2247
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r6)
            r14.setSpan(r0, r15, r4, r13)
        L_0x2247:
            if (r16 == 0) goto L_0x2251
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r14.setSpan(r0, r15, r4, r13)
        L_0x2251:
            X.5fL r2 = (X.C90945fL) r2
            r4 = r7
            r5 = r2
            r6 = r12
            r7 = r14
            X.7h1 r0 = X.M2P.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x07bb
        L_0x225d:
            r1 = 43
            java.lang.String r1 = X.C86114wI.A0m(r14, r1)
            if (r1 != 0) goto L_0x2268
            r17 = 0
            goto L_0x2204
        L_0x2268:
            int r1 = X.AnonymousClass7Kk.A04(r1)     // Catch:{ 1zB -> 0x3361 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)     // Catch:{ 1zB -> 0x3361 }
            goto L_0x2204
        L_0x2271:
            r4 = 41
            r0 = r17
            java.lang.String r0 = r3.A0O(r4, r0)
            goto L_0x21f0
        L_0x227b:
            r4 = 13387(0x344b, float:1.8759E-41)
            if (r0 != r4) goto L_0x2360
            int r21 = android.view.View.MeasureSpec.getMode(r8)
            int r20 = android.view.View.MeasureSpec.getMode(r9)
            java.util.List r19 = r3.A0P()
            int r0 = r19.size()
            android.util.LongSparseArray r10 = new android.util.LongSparseArray
            r10.<init>(r0)
            X.Lyh r6 = r7.A00()
            int r0 = r3.A02
            r34 = r0
            long r4 = (long) r0
            r6.A01(r4, r10)
            X.Lyh r0 = r7.A00()
            java.lang.Object r12 = r0.A00(r4)
            android.util.LongSparseArray r12 = (android.util.LongSparseArray) r12
            java.util.ArrayList r11 = X.C18200wM.A0t(r19)
            r30 = 0
            r6 = 0
        L_0x22b1:
            int r0 = r19.size()
            r15 = 0
            r33 = 1
            if (r6 >= r0) goto L_0x2318
            r0 = r19
            X.7h3 r14 = X.C86154wM.A0Q(r0, r6)
            if (r12 == 0) goto L_0x22d3
            int r0 = r14.A02
            long r4 = (long) r0
            java.lang.Object r0 = r12.get(r4)
            X.6hm r0 = (X.C108076hm) r0
            if (r0 == 0) goto L_0x22d3
            X.5fU r0 = r0.A00
            X.7J7 r15 = r0.A01()
        L_0x22d3:
            android.content.Context r0 = r7.A04
            r23 = r0
            r4 = 0
            X.7h5 r5 = new X.7h5
            r5.<init>(r14, r4)
            X.AnonymousClass2LE.A00(r1)
            int r0 = r7.A03
            if (r57 != 0) goto L_0x2313
            int r13 = X.AnonymousClass7I7.A00
        L_0x22e6:
            int r16 = X.AnonymousClass7I7.A00
            X.84n r4 = new X.84n
            r22 = r4
            r24 = r15
            r25 = r5
            r26 = r17
            r27 = r0
            r28 = r13
            r29 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.5fU r5 = new X.5fU
            r0 = r16
            r5.<init>(r15, r4, r13, r0)
            X.6hm r0 = new X.6hm
            r0.<init>(r5, r14)
            r11.add(r0)
            int r4 = r14.A02
            long r4 = (long) r4
            r10.put(r4, r0)
            int r6 = r6 + 1
            goto L_0x22b1
        L_0x2313:
            int r13 = X.C86134wK.A04(r8)
            goto L_0x22e6
        L_0x2318:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r21
            if (r0 == r1) goto L_0x2322
            if (r0 != r4) goto L_0x2351
        L_0x2322:
            r0 = r20
            if (r0 == r1) goto L_0x2328
            if (r0 != r4) goto L_0x2351
        L_0x2328:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int[] r0 = new int[]{r1, r0}
        L_0x2334:
            r5 = r0[r30]
            r4 = r0[r33]
            X.6ix r1 = new X.6ix
            r1.<init>(r11, r5, r4)
            r0 = r34
            X.AnonymousClass7GP.A01(r11, r0)
            X.7h1 r0 = new X.7h1
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r8
            r14 = r9
            r15 = r5
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x07bb
        L_0x2351:
            r27 = r11
            r28 = r8
            r29 = r9
            r31 = r30
            r32 = r30
            int[] r0 = X.C98906Hj.A00(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x2334
        L_0x2360:
            r4 = 15727(0x3d6f, float:2.2038E-41)
            if (r0 != r4) goto L_0x236a
            X.7h1 r0 = A03(r2, r8, r9)
            goto L_0x07bb
        L_0x236a:
            r4 = 13388(0x344c, float:1.876E-41)
            if (r0 != r4) goto L_0x2383
            int r0 = X.AnonymousClass70L.A00(r8)
            r4 = 0
            int r1 = X.AnonymousClass70L.A00(r9)
            int[] r0 = new int[]{r0, r1}
            r0 = r0[r4]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x2383:
            r4 = 13408(0x3460, float:1.8789E-41)
            if (r0 != r4) goto L_0x2399
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == 0) goto L_0x336e
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 == 0) goto L_0x336e
            X.7h1 r0 = A03(r2, r8, r9)
            goto L_0x07bb
        L_0x2399:
            r4 = 13390(0x344e, float:1.8763E-41)
            if (r0 != r4) goto L_0x23b5
            r0 = 2
            int[] r4 = new int[r0]
            android.content.Context r0 = r7.A04
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r0)
            X.C101806Sr.A00(r0, r4, r8, r9)
            r0 = 0
            r1 = r4[r0]
            r0 = 1
            r0 = r4[r0]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x23b5:
            r4 = 13391(0x344f, float:1.8765E-41)
            if (r0 != r4) goto L_0x2401
            android.content.Context r1 = r7.A04
            r5 = 0
            X.C04220Ms.A0B(r1, r5)
            r0 = 2131233427(0x7f080a93, float:1.8082991E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            if (r4 == 0) goto L_0x337a
            r0 = 2131233428(0x7f080a94, float:1.8082993E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 == 0) goto L_0x3375
            android.graphics.Rect r6 = X.C86134wK.A0D()
            int r4 = r4.getIntrinsicWidth()
            int r0 = r1.getIntrinsicWidth()
            int r0 = r0 << 1
            int r0 = r0 / 5
            int r4 = r4 + r0
            int r0 = r6.left
            int r4 = r4 + r0
            int r0 = r6.right
            int r4 = r4 + r0
            int r1 = r1.getIntrinsicHeight()
            int r0 = r6.top
            int r1 = r1 + r0
            int r0 = r6.bottom
            int r1 = r1 + r0
            int[] r4 = new int[]{r4, r1}
            r1 = r4[r5]
            r0 = 1
            r0 = r4[r0]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x2401:
            r4 = 15900(0x3e1c, float:2.228E-41)
            if (r0 != r4) goto L_0x2426
            android.content.Context r1 = r7.A04
            int r0 = X.C09860go.A07(r1)
            float r5 = (float) r0
            int r0 = X.C09860go.A08(r1)
            float r4 = (float) r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165345(0x7f0700a1, float:1.7944904E38)
            int r1 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r1
            float r4 = r4 / r0
            float r5 = r5 / r4
            int r0 = (int) r5
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x2426:
            r4 = 13546(0x34ea, float:1.8982E-41)
            if (r0 != r4) goto L_0x2438
            int r1 = X.AnonymousClass70L.A00(r8)
            int r0 = X.AnonymousClass70L.A00(r9)
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x2438:
            r4 = 13944(0x3678, float:1.954E-41)
            if (r0 != r4) goto L_0x24ae
            if (r2 == 0) goto L_0x3386
            if (r17 == 0) goto L_0x3386
            com.instagram.service.session.UserSession r6 = X.C86134wK.A0a(r1)
            if (r6 != 0) goto L_0x245f
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Attempt to render product tile component outside logged in user context"
            X.C30967GcS.A02(r1, r0)
            int r1 = X.AnonymousClass70L.A00(r8)
            int r0 = X.AnonymousClass70L.A00(r9)
        L_0x2459:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r0)
            goto L_0x07bb
        L_0x245f:
            X.7h3 r0 = A05(r3)
            if (r0 == 0) goto L_0x337f
            com.instagram.model.shopping.Product r0 = X.C19249AtE.A01(r0)
            com.instagram.model.shopping.productfeed.ProductFeedItem r5 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r5.<init>((com.instagram.model.shopping.Product) r0)
            java.lang.Object r7 = A09(r7, r2)
            android.view.View r7 = (android.view.View) r7
            X.BU9 r0 = X.C19310AuE.A00
            r10 = 1
            if (r0 != 0) goto L_0x247f
            X.BU9 r0 = X.C19310AuE.A00(r1, r3, r6, r10)
            X.C19310AuE.A00 = r0
        L_0x247f:
            X.C19310AuE.A02(r3, r5)
            r4 = 0
            X.90U r0 = new X.90U
            r0.<init>(r7, r4)
            X.BU9 r19 = X.C19310AuE.A00
            r22 = 0
            X.AQH r23 = new X.AQH
            r23.<init>()
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r10)
            r20 = r1
            r21 = r3
            r24 = r5
            r25 = r6
            r26 = r0
            X.C19310AuE.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.measure(r8, r9)
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            goto L_0x2459
        L_0x24ae:
            r4 = 13635(0x3543, float:1.9107E-41)
            if (r0 != r4) goto L_0x2526
            if (r2 == 0) goto L_0x338d
            android.content.Context r1 = r7.A04
            java.util.ArrayList r28 = X.AnonymousClass0wJ.A0v()
            r4 = 40
            android.util.SparseArray r0 = r3.A04
            java.lang.String r23 = X.C86114wI.A0m(r0, r4)
            java.lang.String r24 = A0B(r3)
            java.lang.String r27 = X.C86114wI.A0m(r0, r4)
            X.9vr r21 = X.C170969vr.GRID
            r29 = 0
            r4 = 41
            java.lang.String r0 = ""
            java.lang.String r4 = r3.A0O(r4, r0)
            X.7vA r0 = new X.7vA
            r0.<init>(r4)
            r22 = 0
            java.lang.String r25 = "bloks"
            r26 = r25
            r30 = r29
            r31 = r29
            r32 = r29
            r19 = r1
            r20 = r0
            X.7ss r4 = X.AnonymousClass6VI.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.L1i r0 = r2.A09()
            java.lang.Object r0 = r0.AFU(r1)
            android.view.View r0 = (android.view.View) r0
            X.5Bv r1 = new X.5Bv
            r1.<init>(r0)
            r0 = 1
            X.C1186271q.A01(r1, r4, r0)
            int r5 = X.AnonymousClass70L.A00(r8)
            android.view.View r0 = r1.A01
            r0.measure(r8, r9)
            com.instagram.shopping.widget.clickabletext.ClickableTextContainer r4 = r1.A09
            r4.measure(r8, r9)
            int r1 = r0.getMeasuredHeight()
            int r0 = r4.getMeasuredHeight()
            int r1 = r1 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.C18230wP.A0H(r4)
            int r0 = r0.topMargin
            int r1 = r1 + r0
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r5, r1)
            goto L_0x07bb
        L_0x2526:
            r4 = 13648(0x3550, float:1.9125E-41)
            if (r0 != r4) goto L_0x2532
            if (r2 == 0) goto L_0x3394
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x2532:
            r4 = 16053(0x3eb5, float:2.2495E-41)
            if (r0 != r4) goto L_0x2552
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r4 = X.AnonymousClass70L.A01(r1, r8)
            r0 = 0
            int r1 = X.AnonymousClass70L.A01(r1, r9)
            int[] r7 = new int[]{r4, r1}
            r10 = r7[r0]
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r11 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x2552:
            r4 = 13955(0x3683, float:1.9555E-41)
            if (r0 != r4) goto L_0x2563
            X.7h3 r10 = A05(r3)
            if (r10 != 0) goto L_0x264d
            java.lang.String r0 = "Dialog wrapper has no child"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x2563:
            r4 = 13617(0x3531, float:1.9081E-41)
            if (r0 != r4) goto L_0x25a0
            java.lang.String r4 = "MiniBloksComponentProductTileName"
            if (r2 == 0) goto L_0x33a0
            java.lang.Object r4 = A09(r7, r2)
            r0 = 3
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r4, r0)
            android.view.View r4 = (android.view.View) r4
            if (r17 == 0) goto L_0x339b
            X.C95215ze.A00(r4, r1, r3)
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.7h1 r0 = X.C127377h1.A00(r4, r2, r8, r9)
            X.M5L r5 = r0.B6z()
            int r4 = r0.BMC()
            int r2 = r0.Aml()
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = r0.getHeight()
            X.7h1 r0 = X.C127377h1.A01(r5, r4, r2, r1, r0)
            goto L_0x07bb
        L_0x25a0:
            r4 = 16586(0x40ca, float:2.3242E-41)
            if (r0 != r4) goto L_0x25b0
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            X.5fR r2 = (X.C91005fR) r2
            X.MeD r0 = r2.ABY(r7, r8, r9)
            goto L_0x07bb
        L_0x25b0:
            r4 = 13666(0x3562, float:1.915E-41)
            if (r0 != r4) goto L_0x25bd
            if (r2 != 0) goto L_0x25ca
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x25bd:
            r4 = 16229(0x3f65, float:2.2742E-41)
            if (r0 != r4) goto L_0x25d0
            if (r2 != 0) goto L_0x25ca
            java.lang.String r0 = "ProgressBar binder returned a null ProgressBarView from createView"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x25ca:
            X.7h1 r0 = A02(r7, r2, r8, r9)
            goto L_0x07bb
        L_0x25d0:
            r4 = 13708(0x358c, float:1.9209E-41)
            if (r0 != r4) goto L_0x263a
            r0 = 41
            X.7h3 r5 = r3.A0K(r0)
            if (r5 == 0) goto L_0x33b2
            if (r17 == 0) goto L_0x33ab
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r1, r3)
            X.6qE r0 = (X.C112806qE) r0
            X.6uk r6 = r0.A00
            if (r6 != 0) goto L_0x25f3
            X.MeD r1 = r5.ABY(r7, r8, r9)
            X.7h0 r0 = new X.7h0
            r0.<init>(r1, r2)
            goto L_0x07bb
        L_0x25f3:
            android.graphics.RectF r0 = r6.A01
            float r0 = r0.width()
            int r0 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            android.graphics.RectF r10 = r6.A01
            float r0 = r10.height()
            int r0 = (int) r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            X.MeD r20 = r5.ABY(r7, r1, r0)
            android.graphics.RectF r1 = r6.A02
            float r0 = r1.width()
            int r6 = (int) r0
            float r0 = r1.height()
            int r5 = (int) r0
            float r0 = r10.left
            int r4 = (int) r0
            float r0 = r10.top
            int r1 = (int) r0
            r22 = 0
            X.7h0 r0 = new X.7h0
            r19 = r0
            r21 = r2
            r23 = r6
            r24 = r5
            r25 = r8
            r26 = r9
            r27 = r4
            r28 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x07bb
        L_0x263a:
            r4 = 16444(0x403c, float:2.3043E-41)
            if (r0 != r4) goto L_0x2658
            r0 = 42
            X.7h3 r10 = r3.A0K(r0)
            if (r10 != 0) goto L_0x264d
            java.lang.String r0 = "Server should have ensured that the Tooltip Container always has a child."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x264d:
            X.MeD r1 = r10.ABY(r7, r8, r9)
            X.7h0 r0 = new X.7h0
            r0.<init>(r1, r2)
            goto L_0x07bb
        L_0x2658:
            r4 = 15770(0x3d9a, float:2.2098E-41)
            if (r0 != r4) goto L_0x33ce
            r14 = 0
            r28 = 1
            java.lang.String r21 = "Required value was null."
            if (r17 == 0) goto L_0x33c9
            r4 = 43
            android.util.SparseArray r0 = r3.A04
            java.lang.String r20 = X.C86114wI.A0m(r0, r4)
            android.content.Context r0 = r7.A04
            r22 = r0
            X.MNV r11 = X.M2T.A00(r22)
            r0 = r28
            r11.A0a = r0
            r11.A0L = r14
            if (r20 == 0) goto L_0x2687
            int r27 = X.AnonymousClass7Kk.A07(r20)     // Catch:{ 1zB -> 0x33b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            X.AnonymousClass7B1.A02(r11, r0)
            goto L_0x268a
        L_0x2687:
            r27 = 8388611(0x800003, float:1.1754948E-38)
        L_0x268a:
            r0 = 32
            java.util.List r0 = r3.A0R(r0)
            X.36v r0 = X.AnonymousClass7B1.A00(r1, r3, r0)
            java.lang.CharSequence r0 = r0.A00
            android.text.SpannableString r26 = android.text.SpannableString.valueOf(r0)
            r4 = 2131307157(0x7f092a95, float:1.8232533E38)
            android.util.SparseArray r0 = r1.A01
            java.lang.Object r0 = r0.get(r4)
            X.Abg r0 = (X.C18212Abg) r0
            r4 = 140(0x8c, float:1.96E-43)
            X.7h3 r25 = r3.A0K(r4)
            if (r25 == 0) goto L_0x26ce
            if (r0 == 0) goto L_0x26ce
            com.instagram.service.session.UserSession r10 = r0.A00
            if (r10 == 0) goto L_0x26ce
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r4 = 36314369395918726(0x8103ba00160786, double:3.0286916599830705E-306)
            boolean r4 = X.C63803iN.A0E(r6, r10, r4)
            if (r4 == 0) goto L_0x26ce
            r4 = r25
            int r4 = X.C101086Pv.A00(r1, r4, r14)
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L_0x26ce
            r25 = 0
        L_0x26ce:
            android.text.TextPaint r19 = new android.text.TextPaint
            r19.<init>()
            if (r2 == 0) goto L_0x33c4
            X.5fL r2 = (X.C90945fL) r2
            r5 = 44
            r24 = -1
            r4 = r24
            int r4 = r3.A0H(r5, r4)
            if (r4 == 0) goto L_0x26e5
            r24 = r4
        L_0x26e5:
            r12 = 38
            java.lang.String r10 = "12sp"
            java.lang.String r4 = A0F(r3, r10, r12)
            java.lang.String r13 = X.AnonymousClass8bP.A0P(r4)
            int r6 = X.AnonymousClass2C6.A00(r13)
            int r5 = r13.length()
            r4 = 1
            if (r5 == 0) goto L_0x270d
            r15 = 2
            boolean r5 = X.C86144wL.A1Y(r13)
            if (r5 != 0) goto L_0x270d
            int r6 = r6 - r15
            java.lang.String r5 = X.C86134wK.A0q(r13, r6)     // Catch:{ 1zB | StringIndexOutOfBoundsException -> 0x270e }
            int r4 = X.AnonymousClass7Kk.A08(r5)     // Catch:{ 1zB | StringIndexOutOfBoundsException -> 0x270e }
            goto L_0x270e
        L_0x270d:
            r4 = 2
        L_0x270e:
            X.C04220Ms.A06(r26)
            java.lang.String r17 = r3.A0O(r12, r10)
            r6 = 36
            java.lang.String r5 = "48sp"
            java.lang.String r16 = r3.A0O(r6, r5)
            r6 = r17
            r5 = r16
            boolean r5 = X.C04220Ms.A0I(r6, r5)
            if (r5 == 0) goto L_0x2961
            X.C04220Ms.A06(r17)
            int r15 = X.AnonymousClass7GB.A01(r17)
        L_0x272e:
            android.text.style.AbsoluteSizeSpan r10 = new android.text.style.AbsoluteSizeSpan
            r5 = r28
            r10.<init>(r15, r5)
            int r6 = r26.length()
            r5 = r26
            r5.setSpan(r10, r14, r6, r14)
            float r6 = (float) r15
            android.util.DisplayMetrics r5 = X.C18230wP.A0E(r22)
            float r4 = android.util.TypedValue.applyDimension(r4, r6, r5)
            int r4 = (int) r4
            r13 = r4
            if (r25 == 0) goto L_0x295d
            float r6 = (float) r4
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r10 = r10 * r6
            r4 = 1039516303(0x3df5c28f, float:0.12)
            float r6 = r6 * r4
        L_0x2754:
            int r4 = android.view.View.MeasureSpec.getMode(r9)
            boolean r23 = X.C18180wK.A1W(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            float r5 = (float) r4
            r4 = 2
            float r4 = (float) r4
            r22 = r4
            float r4 = r4 * r10
            float r5 = r5 - r4
            int r4 = (int) r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r37 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            if (r23 == 0) goto L_0x294e
            r38 = 0
        L_0x2772:
            r33 = r7
            r34 = r2
            r35 = r11
            r36 = r26
            X.7h1 r4 = X.M2P.A01(r33, r34, r35, r36, r37, r38)
            java.lang.Object r4 = r4.A04
            X.6mk r4 = (X.C111076mk) r4
            if (r4 == 0) goto L_0x33bf
            android.text.Layout r4 = r4.A02
            r29 = r4
            r19.reset()
            android.text.TextPaint r5 = r29.getPaint()
            r4 = r19
            r4.set(r5)
            float r4 = (float) r13
            r21 = r4
            r5 = r19
            r5.setTextSize(r4)
            r5 = 0
            r4 = r19
            int r19 = r4.getFontMetricsInt(r5)
            r4 = 46
            java.lang.Object r4 = A0A(r3, r4)
            boolean r20 = X.AnonymousClass2LL.A00(r4, r14)
            if (r0 == 0) goto L_0x27c4
            com.instagram.service.session.UserSession r4 = r0.A00
            r12 = r4
            if (r4 == 0) goto L_0x2923
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r16 = 36314369396115337(0x8103ba00190789, double:3.028691660107408E-306)
            r13 = r4
            r4 = r16
            boolean r4 = X.C63803iN.A0E(r13, r12, r4)
            if (r4 == 0) goto L_0x2923
        L_0x27c4:
            if (r23 == 0) goto L_0x2923
            r12 = r24
        L_0x27c8:
            if (r0 == 0) goto L_0x27e2
            com.instagram.service.session.UserSession r0 = r0.A00
            r19 = r0
            if (r0 == 0) goto L_0x2917
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r16 = 36314369396049800(0x8103ba00180788, double:3.028691660065962E-306)
            r13 = r0
            r4 = r16
            r0 = r19
            boolean r0 = X.C63803iN.A0E(r13, r0, r4)
            if (r0 == 0) goto L_0x2917
        L_0x27e2:
            r4 = -1
            r0 = r24
            if (r0 != r4) goto L_0x2917
            if (r12 <= r4) goto L_0x27ef
        L_0x27e9:
            r11.A0P = r12
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r11.A0U = r0
        L_0x27ef:
            r0 = 45
            java.util.List r4 = r3.A0R(r0)
            X.C04220Ms.A06(r4)
            boolean r0 = X.C18190wL.A1a(r4)
            if (r0 == 0) goto L_0x2818
            X.36v r0 = X.AnonymousClass7B1.A00(r1, r3, r4)
            java.lang.CharSequence r0 = r0.A00
            android.text.SpannableString r5 = android.text.SpannableString.valueOf(r0)
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            r0 = r28
            r4.<init>(r15, r0)
            int r0 = r5.length()
            r5.setSpan(r4, r14, r0, r14)
            r11.A0W = r5
        L_0x2818:
            if (r25 == 0) goto L_0x2889
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r11.A0Y = r0
            r11.A0H = r10
            r11.A0I = r10
            int r0 = android.view.View.MeasureSpec.getSize(r37)
            float r0 = (float) r0
            float r0 = r0 - r10
            int r4 = (int) r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r37 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            X.7h1 r0 = X.M2P.A01(r33, r34, r35, r36, r37, r38)
            java.lang.Object r4 = r0.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.text.TextMeasurementUtils.TextLayoutContext"
            X.C04220Ms.A0C(r4, r0)
            X.6mk r4 = (X.C111076mk) r4
            int r5 = android.view.View.MeasureSpec.getSize(r9)
            int r0 = A01(r4)
            int r12 = r5 - r0
            float r12 = X.C86134wK.A01(r12)
            if (r5 >= r0) goto L_0x290c
            r6 = 0
        L_0x284d:
            r0 = 1082130432(0x40800000, float:4.0)
            float r21 = r21 / r0
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x2859
            r21 = 1090519040(0x41000000, float:8.0)
        L_0x2859:
            r0 = r25
            int r36 = X.C101086Pv.A00(r1, r0, r14)
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r1, r3)
            X.75U r0 = (X.AnonymousClass75U) r0
            r0.A00 = r10
            r0.A01 = r6
            android.text.Layout r0 = r4.A02
            X.7QM r4 = new X.7QM
            r30 = r0
            r31 = r10
            r32 = r10
            r33 = r6
            r34 = r6
            r35 = r21
            r29 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            int r5 = r26.length()
            r1 = 18
            r0 = r26
            r0.setSpan(r4, r14, r5, r1)
        L_0x2889:
            r33 = r7
            r34 = r2
            r35 = r11
            r36 = r26
            X.7h1 r5 = X.M2P.A01(r33, r34, r35, r36, r37, r38)
            java.lang.Object r2 = r5.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.text.TextMeasurementUtils.TextLayoutContext"
            X.C04220Ms.A0C(r2, r0)
            r4 = r2
            X.6mk r4 = (X.C111076mk) r4
            if (r20 == 0) goto L_0x2900
            int r11 = A01(r4)
            float r22 = r22 * r6
            r0 = r22
            int r0 = (int) r0
            int r11 = r11 + r0
        L_0x28ab:
            if (r25 == 0) goto L_0x28c7
            r7 = 1073741824(0x40000000, float:2.0)
            if (r20 != 0) goto L_0x28b4
            if (r23 == 0) goto L_0x28f4
            r6 = 0
        L_0x28b4:
            r4.A01 = r6
            r1 = r27
            r0 = r28
            if (r1 == r0) goto L_0x28e6
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r27
            if (r0 == r1) goto L_0x28d7
            float r1 = r4.A00
        L_0x28c5:
            r4.A00 = r1
        L_0x28c7:
            X.M5L r1 = r5.A03
            int r10 = android.view.View.MeasureSpec.getSize(r8)
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r1
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x28d7:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            float r1 = (float) r0
            android.text.Layout r0 = r4.A02
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 + r10
            float r1 = r1 - r0
            goto L_0x28c5
        L_0x28e6:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            android.text.Layout r0 = r4.A02
            int r0 = r0.getWidth()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 / r7
            goto L_0x28c5
        L_0x28f4:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int r0 = A01(r4)
            int r1 = r1 - r0
            float r6 = (float) r1
            float r6 = r6 / r7
            goto L_0x28b4
        L_0x2900:
            if (r23 == 0) goto L_0x2907
            int r11 = A01(r4)
            goto L_0x28ab
        L_0x2907:
            int r11 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x28ab
        L_0x290c:
            float r5 = java.lang.Math.abs(r12)
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x284d
            r6 = r5
            goto L_0x284d
        L_0x2917:
            r0 = r24
            if (r12 <= r0) goto L_0x291c
            r12 = r0
        L_0x291c:
            r0 = r28
            if (r12 >= r0) goto L_0x27e9
            r12 = 1
            goto L_0x27e9
        L_0x2923:
            r4 = r9
            if (r20 == 0) goto L_0x2928
            r4 = r38
        L_0x2928:
            int r12 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = r29.getTopPadding()
            int r12 = r12 - r4
            int r4 = r29.getBottomPadding()
            int r12 = r12 - r4
            int r12 = r12 / r19
            if (r20 != 0) goto L_0x27c8
            int r5 = android.view.View.MeasureSpec.getSize(r9)
            int r4 = r29.getHeight()
            if (r5 >= r4) goto L_0x27c8
            int r4 = r29.getLineCount()
            if (r4 < r12) goto L_0x27c8
            int r12 = r12 + -1
            goto L_0x27c8
        L_0x294e:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            float r4 = (float) r4
            float r12 = r22 * r6
            float r4 = r4 - r12
            int r4 = (int) r4
            int r38 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            goto L_0x2772
        L_0x295d:
            r10 = 0
            r6 = 0
            goto L_0x2754
        L_0x2961:
            X.7GB r35 = X.AnonymousClass7GB.A00
            X.C04220Ms.A06(r17)
            int r38 = X.AnonymousClass7GB.A01(r17)
            X.C04220Ms.A06(r16)
            int r39 = X.AnonymousClass7GB.A01(r16)
            android.graphics.RectF r10 = X.C86134wK.A0E()
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            float r12 = (float) r5
            int r5 = android.view.View.MeasureSpec.getSize(r9)
            float r6 = (float) r5
            r5 = 0
            r10.set(r5, r5, r12, r6)
            java.lang.String r5 = "1sp"
            int r40 = X.AnonymousClass7GB.A01(r5)
            boolean r43 = X.AnonymousClass0wJ.A1W(r25)
            r29 = r10
            r30 = r26
            r31 = r19
            r32 = r7
            r33 = r2
            r34 = r11
            r36 = r8
            r37 = r9
            r41 = r24
            r42 = r4
            int r15 = X.AnonymousClass7GB.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r5 = -1
            if (r15 != r5) goto L_0x2a03
            if (r0 == 0) goto L_0x29ff
            com.instagram.service.session.UserSession r13 = r0.A00
            if (r13 == 0) goto L_0x29ff
            X.0TJ r12 = X.AnonymousClass0TJ.A05
            r5 = 36314369395328897(0x8103ba000d0781, double:3.02869165961006E-306)
            boolean r5 = X.C63803iN.A0E(r12, r13, r5)
            if (r5 == 0) goto L_0x29ff
            java.lang.String r5 = "Width: "
            java.lang.StringBuilder r6 = X.C18190wL.A0s(r5)
            r6.append(r8)
            java.lang.String r5 = ", Height: "
            r6.append(r5)
            r6.append(r9)
            java.lang.String r5 = ", TextAlign, "
            r6.append(r5)
            r5 = r20
            r6.append(r5)
            java.lang.String r5 = ", MinTextSize: "
            r6.append(r5)
            r5 = r17
            r6.append(r5)
            java.lang.String r5 = ", MaxTextSize: "
            r6.append(r5)
            r5 = r16
            r6.append(r5)
            java.lang.String r5 = ", MaxLines: "
            r6.append(r5)
            r5 = r24
            r6.append(r5)
            java.lang.String r5 = ", TextRect: "
            java.lang.String r6 = X.C86104wH.A0x(r10, r5, r6)
            java.lang.String r5 = "showreel_dynamic_text_calculate_layout"
            X.C30967GcS.A02(r5, r6)
        L_0x29ff:
            r15 = r38
            goto L_0x272e
        L_0x2a03:
            if (r15 != r5) goto L_0x272e
            goto L_0x29ff
        L_0x2a06:
            r0 = 38
            r5 = 0
            int r1 = r3.A0H(r0, r5)
            android.content.Context r6 = r7.A04
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r6)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            int r1 = r1 * r0
            int r4 = X.AnonymousClass70L.A01(r1, r8)
            r0 = 36
            int r1 = r3.A0H(r0, r5)
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r6)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            int r1 = r1 * r0
            int r1 = X.AnonymousClass70L.A01(r1, r9)
            int[] r7 = new int[]{r4, r1}
            r10 = r7[r5]
            X.7h1 r0 = new X.7h1
            r5 = r0
            r6 = r2
            r11 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07bb
        L_0x2a3f:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r5 = 0
            if (r0 != 0) goto L_0x2a5f
            r4 = 0
        L_0x2a47:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x2a5a
            r1 = 0
        L_0x2a4e:
            int[] r0 = new int[]{r4, r1}
            r0 = r0[r5]
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r0, r1)
            goto L_0x07bb
        L_0x2a5a:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x2a4e
        L_0x2a5f:
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x2a47
        L_0x2a64:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "ComponentMapper"
            X.C30967GcS.A02(r0, r1)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L_0x2a94
            int r1 = android.view.View.MeasureSpec.getSize(r8)
        L_0x2a84:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r4) goto L_0x2a8e
            int r5 = android.view.View.MeasureSpec.getSize(r9)
        L_0x2a8e:
            X.7h1 r0 = X.C127377h1.A01(r2, r8, r9, r1, r5)
            goto L_0x07bb
        L_0x2a94:
            r1 = 0
            goto L_0x2a84
        L_0x2a96:
            r2 = 13336(0x3418, float:1.8688E-41)
            if (r0 != r2) goto L_0x2aa1
            X.5zS r2 = new X.5zS
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2aa1:
            r2 = 16160(0x3f20, float:2.2645E-41)
            if (r0 != r2) goto L_0x2aac
            X.5z5 r2 = new X.5z5
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2aac:
            r2 = 16260(0x3f84, float:2.2785E-41)
            if (r0 != r2) goto L_0x2ab7
            X.IgZ r2 = new X.IgZ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2ab7:
            r2 = 13329(0x3411, float:1.8678E-41)
            if (r0 != r2) goto L_0x2add
            int r2 = r3.A02
            long r4 = (long) r2
            X.5fL r2 = new X.5fL
            r2.<init>(r4)
            r4 = 41
            X.6jp r5 = r3.A0L(r4)
            if (r5 == 0) goto L_0x2ad3
            X.7ho r4 = new X.7ho
            r4.<init>(r1, r3, r5)
            X.C86124wJ.A1N(r4, r2)
        L_0x2ad3:
            X.7hc r4 = new X.7hc
            r4.<init>(r1)
        L_0x2ad8:
            X.C86124wJ.A1N(r4, r2)
            goto L_0x0795
        L_0x2add:
            r2 = 13335(0x3417, float:1.8686E-41)
            if (r0 != r2) goto L_0x2afb
            int r2 = r3.A02
            long r4 = (long) r2
            X.5fL r2 = new X.5fL
            r2.<init>(r4)
            r4 = 40
            X.6jp r5 = r3.A0L(r4)
            if (r5 == 0) goto L_0x0795
            X.7ho r4 = new X.7ho
            r4.<init>(r1, r3, r5)
            X.C86124wJ.A1N(r4, r2)
            goto L_0x0795
        L_0x2afb:
            r2 = 13797(0x35e5, float:1.9334E-41)
            if (r0 == r2) goto L_0x3215
            r2 = 14093(0x370d, float:1.9748E-41)
            if (r0 != r2) goto L_0x2b1a
            r4 = 2131298255(0x7f0907cf, float:1.8214478E38)
            android.util.SparseArray r2 = r1.A01
            java.lang.Object r5 = r2.get(r4)
            X.4tz r5 = (X.C84864tz) r5
            if (r5 != 0) goto L_0x2f58
            java.lang.String r4 = "CDSBottomSheetWrapperBinderUtils"
            java.lang.String r2 = "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly."
            X.C30967GcS.A02(r4, r2)
        L_0x2b17:
            r2 = 0
            goto L_0x0795
        L_0x2b1a:
            r2 = 16682(0x412a, float:2.3376E-41)
            if (r0 != r2) goto L_0x2b25
            X.5zW r2 = new X.5zW
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2b25:
            r2 = 16278(0x3f96, float:2.281E-41)
            if (r0 != r2) goto L_0x2b36
            java.lang.Object r4 = X.AnonymousClass7K7.A03(r1, r3)
            X.Jfn r4 = (X.C36856Jfn) r4
            X.Iga r2 = new X.Iga
            r2.<init>(r4, r1, r3)
            goto L_0x0795
        L_0x2b36:
            r2 = 15981(0x3e6d, float:2.2394E-41)
            if (r0 != r2) goto L_0x2b41
            X.FPh r2 = new X.FPh
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2b41:
            r2 = 16111(0x3eef, float:2.2576E-41)
            if (r0 != r2) goto L_0x2b4c
            X.5zT r2 = new X.5zT
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2b4c:
            r2 = 16641(0x4101, float:2.3319E-41)
            if (r0 != r2) goto L_0x2b57
            X.5zd r2 = new X.5zd
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2b57:
            r2 = 16688(0x4130, float:2.3385E-41)
            if (r0 != r2) goto L_0x2b6e
            java.lang.Object r2 = X.AnonymousClass7K7.A04(r1, r3)
            X.6bX r2 = (X.C104286bX) r2
            if (r2 == 0) goto L_0x2b6c
            X.6xT r4 = r2.A00
        L_0x2b65:
            X.5za r2 = new X.5za
            r2.<init>(r4, r1, r3)
            goto L_0x0795
        L_0x2b6c:
            r4 = 0
            goto L_0x2b65
        L_0x2b6e:
            r2 = 16095(0x3edf, float:2.2554E-41)
            if (r0 != r2) goto L_0x2b79
            X.9Ud r2 = new X.9Ud
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2b79:
            r2 = 15856(0x3df0, float:2.2219E-41)
            if (r0 != r2) goto L_0x2b95
            java.lang.String r11 = "CPDPHeroCarouselVideoComponent"
            com.instagram.service.session.UserSession r10 = X.C18670AjO.A00(r1, r11)
            r2 = 0
            if (r10 == 0) goto L_0x0795
            X.BKe r6 = new X.BKe
            r6.<init>()
            r4 = 43
            java.lang.String r5 = r3.A0O(r4, r2)
            if (r5 == 0) goto L_0x0795
            goto L_0x2f68
        L_0x2b95:
            r2 = 15894(0x3e16, float:2.2272E-41)
            if (r0 != r2) goto L_0x2baf
            java.lang.String r2 = "CPDPLightBoxReelsVideoComponent"
            com.instagram.service.session.UserSession r5 = X.C18670AjO.A00(r1, r2)
            r2 = 0
            if (r5 == 0) goto L_0x0795
            r4 = 35
            java.lang.String r10 = r3.A0O(r4, r2)
            if (r10 == 0) goto L_0x0795
            r6 = 41
            r4 = -1
            goto L_0x3046
        L_0x2baf:
            r2 = 16068(0x3ec4, float:2.2516E-41)
            if (r0 != r2) goto L_0x2bba
            X.5zf r2 = new X.5zf
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2bba:
            r2 = 16534(0x4096, float:2.3169E-41)
            if (r0 != r2) goto L_0x2bca
            X.6fv r4 = new X.6fv
            r4.<init>(r1, r3)
            X.FPe r2 = new X.FPe
            r2.<init>(r4, r1, r3)
            goto L_0x0795
        L_0x2bca:
            r2 = 15753(0x3d89, float:2.2075E-41)
            if (r0 != r2) goto L_0x2bd5
            X.FPg r2 = new X.FPg
            r2.<init>(r1, r3, r3)
            goto L_0x0795
        L_0x2bd5:
            r2 = 16467(0x4053, float:2.3075E-41)
            if (r0 != r2) goto L_0x2be0
            X.5z4 r2 = new X.5z4
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2be0:
            r2 = 16411(0x401b, float:2.2997E-41)
            if (r0 != r2) goto L_0x2beb
            X.1jL r2 = new X.1jL
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2beb:
            r2 = 16355(0x3fe3, float:2.2918E-41)
            if (r0 != r2) goto L_0x2bf6
            X.FPZ r2 = new X.FPZ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2bf6:
            r2 = 16535(0x4097, float:2.317E-41)
            if (r0 != r2) goto L_0x2c01
            X.1jW r2 = new X.1jW
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c01:
            r2 = 16383(0x3fff, float:2.2957E-41)
            if (r0 != r2) goto L_0x2c0c
            X.1jM r2 = new X.1jM
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c0c:
            r2 = 16536(0x4098, float:2.3172E-41)
            if (r0 != r2) goto L_0x2c17
            X.1jX r2 = new X.1jX
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c17:
            r2 = 16390(0x4006, float:2.2967E-41)
            if (r0 != r2) goto L_0x2c22
            X.1jN r2 = new X.1jN
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c22:
            r2 = 16218(0x3f5a, float:2.2726E-41)
            if (r0 != r2) goto L_0x2c2d
            X.5zg r2 = new X.5zg
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c2d:
            r2 = 13922(0x3662, float:1.9509E-41)
            if (r0 != r2) goto L_0x2c38
            X.1jO r2 = new X.1jO
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c38:
            r2 = 15778(0x3da2, float:2.211E-41)
            if (r0 != r2) goto L_0x2c43
            X.FPb r2 = new X.FPb
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c43:
            r2 = 15728(0x3d70, float:2.204E-41)
            if (r0 != r2) goto L_0x2c4e
            X.FPc r2 = new X.FPc
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c4e:
            r2 = 16675(0x4123, float:2.3367E-41)
            if (r0 != r2) goto L_0x2c87
            int r2 = r3.A02
            X.5fM r2 = A07(r1, r2)
            X.40m r4 = new X.40m
            r4.<init>(r1)
            X.C86134wK.A1I(r4, r2, r3)
            r5 = 38
            X.7h3 r4 = r3.A0K(r5)
            r10 = 0
            if (r4 == 0) goto L_0x2c85
            X.6jp r6 = A08(r4)
        L_0x2c6d:
            X.7h3 r4 = r3.A0K(r5)
            if (r4 == 0) goto L_0x2c77
            X.6jp r10 = X.C18230wP.A0V(r4)
        L_0x2c77:
            if (r6 != 0) goto L_0x2c7b
            if (r10 == 0) goto L_0x0795
        L_0x2c7b:
            X.40o r5 = new X.40o
            r5.<init>(r1, r3, r10, r6)
        L_0x2c80:
            X.C86134wK.A1I(r5, r2, r3)
            goto L_0x0795
        L_0x2c85:
            r6 = r10
            goto L_0x2c6d
        L_0x2c87:
            r2 = 13334(0x3416, float:1.8685E-41)
            if (r0 != r2) goto L_0x2c92
            X.5z9 r2 = new X.5z9
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c92:
            r2 = 16079(0x3ecf, float:2.2531E-41)
            if (r0 != r2) goto L_0x2c9d
            X.5zA r2 = new X.5zA
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2c9d:
            r2 = 16265(0x3f89, float:2.2792E-41)
            if (r0 != r2) goto L_0x2ca8
            X.5zV r2 = new X.5zV
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2ca8:
            r2 = 13389(0x344d, float:1.8762E-41)
            if (r0 != r2) goto L_0x2cb3
            X.5zO r2 = new X.5zO
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2cb3:
            r2 = 13392(0x3450, float:1.8766E-41)
            if (r0 != r2) goto L_0x2cbe
            X.5zP r2 = new X.5zP
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2cbe:
            r2 = 16166(0x3f26, float:2.2653E-41)
            if (r0 != r2) goto L_0x2cc9
            X.5zQ r2 = new X.5zQ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2cc9:
            r2 = 15768(0x3d98, float:2.2096E-41)
            if (r0 != r2) goto L_0x2cf2
            java.lang.Object r5 = X.AnonymousClass7K7.A04(r1, r3)
            X.AgB r5 = (X.C18479AgB) r5
            if (r5 == 0) goto L_0x33dd
            android.content.Context r4 = r1.A00
            X.4rP r2 = r1.A02
            X.7qT r2 = (X.C130667qT) r2
            X.9V6 r21 = X.AnonymousClass6OG.A00(r2)
            X.9Ue r2 = new X.9Ue
            r19 = r2
            r20 = r4
            r22 = r5
            r23 = r1
            r24 = r3
            r25 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25)
            goto L_0x0795
        L_0x2cf2:
            r2 = 15969(0x3e61, float:2.2377E-41)
            if (r0 != r2) goto L_0x2cfd
            X.1jP r2 = new X.1jP
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2cfd:
            r2 = 13894(0x3646, float:1.947E-41)
            if (r0 != r2) goto L_0x2d08
            X.5zB r2 = new X.5zB
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d08:
            r2 = 13616(0x3530, float:1.908E-41)
            if (r0 != r2) goto L_0x2d13
            X.1jQ r2 = new X.1jQ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d13:
            r2 = 13775(0x35cf, float:1.9303E-41)
            if (r0 != r2) goto L_0x2d1e
            X.IgX r2 = new X.IgX
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d1e:
            r2 = 13907(0x3653, float:1.9488E-41)
            if (r0 != r2) goto L_0x2d29
            X.5zC r2 = new X.5zC
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d29:
            r2 = 13745(0x35b1, float:1.9261E-41)
            if (r0 != r2) goto L_0x2d52
            com.instagram.service.session.UserSession r5 = X.C86134wK.A0a(r1)
            if (r5 == 0) goto L_0x2d44
            r2 = 46
            r4 = 0
            java.lang.Object r2 = A0A(r3, r2)
            boolean r2 = X.AnonymousClass2LL.A00(r2, r4)
            if (r2 == 0) goto L_0x2d44
            r2 = 0
            X.C48962qc.A00(r5, r2)
        L_0x2d44:
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            X.Igb r2 = new X.Igb
            r2.<init>(r1, r3, r4)
            X.7hd r5 = new X.7hd
            r5.<init>(r3)
            goto L_0x2c80
        L_0x2d52:
            r2 = 13375(0x343f, float:1.8742E-41)
            if (r0 != r2) goto L_0x2d5d
            X.1jR r2 = new X.1jR
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d5d:
            r2 = 13379(0x3443, float:1.8748E-41)
            if (r0 != r2) goto L_0x2d68
            X.5zD r2 = new X.5zD
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2d68:
            r2 = 16122(0x3efa, float:2.2592E-41)
            if (r0 != r2) goto L_0x2dcf
            X.0i6 r2 = X.C63913ic.A0E(r1)
            com.instagram.service.session.UserSession r13 = X.C05030Qo.A02(r2)
            android.content.Context r4 = r1.A00
            androidx.fragment.app.Fragment r2 = X.C63913ic.A00(r1)
            X.9VF r12 = new X.9VF
            r12.<init>(r4, r2, r13)
            X.06C r4 = (X.AnonymousClass06C) r4
            X.7aV r2 = new X.7aV
            r2.<init>()
            X.7IU r4 = X.AnonymousClass7IU.A00(r2, r4)
            java.lang.Class<X.57E> r2 = X.AnonymousClass57E.class
            X.3ak r11 = r4.A01(r2)
            X.57E r11 = (X.AnonymousClass57E) r11
            r2 = 2131297507(0x7f0904e3, float:1.821296E38)
            java.lang.Object r10 = r1.A00(r2)
            X.0kW r10 = (X.C11630kW) r10
            X.Aeb r6 = new X.Aeb
            r6.<init>(r10, r13)
            r2 = 2131298570(0x7f09090a, float:1.8215117E38)
            java.lang.Object r5 = r1.A00(r2)
            X.AXi r5 = (X.C18040AXi) r5
            r2 = 2131302856(0x7f0919c8, float:1.822381E38)
            java.lang.Object r4 = r1.A00(r2)
            X.KNR r4 = (X.KNR) r4
            X.5zc r2 = new X.5zc
            r19 = r2
            r20 = r6
            r21 = r10
            r22 = r1
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r12
            r27 = r5
            r28 = r11
            r29 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0795
        L_0x2dcf:
            r2 = 13533(0x34dd, float:1.8964E-41)
            if (r0 != r2) goto L_0x2dda
            X.5zE r2 = new X.5zE
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2dda:
            r2 = 13780(0x35d4, float:1.931E-41)
            if (r0 != r2) goto L_0x2de5
            X.FPd r2 = new X.FPd
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2de5:
            r2 = 13636(0x3544, float:1.9108E-41)
            if (r0 != r2) goto L_0x2df0
            X.1jS r2 = new X.1jS
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2df0:
            r2 = 13697(0x3581, float:1.9194E-41)
            if (r0 != r2) goto L_0x2dfb
            X.1jT r2 = new X.1jT
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2dfb:
            r2 = 14045(0x36dd, float:1.9681E-41)
            if (r0 != r2) goto L_0x2e06
            X.5zF r2 = new X.5zF
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2e06:
            r2 = 14041(0x36d9, float:1.9676E-41)
            if (r0 != r2) goto L_0x2e11
            X.5zG r2 = new X.5zG
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2e11:
            r2 = 13982(0x369e, float:1.9593E-41)
            if (r0 != r2) goto L_0x2e2e
            androidx.fragment.app.Fragment r4 = X.C63913ic.A00(r1)
            boolean r2 = r4 instanceof X.C81844oU
            if (r2 == 0) goto L_0x2e2c
            X.4oU r4 = (X.C81844oU) r4
        L_0x2e1f:
            int r2 = r3.A02
            X.5fM r2 = A07(r1, r2)
            X.40n r5 = new X.40n
            r5.<init>(r4, r1)
            goto L_0x2c80
        L_0x2e2c:
            r4 = 0
            goto L_0x2e1f
        L_0x2e2e:
            r2 = 13393(0x3451, float:1.8768E-41)
            if (r0 != r2) goto L_0x2e39
            X.FPf r2 = new X.FPf
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2e39:
            r2 = 14054(0x36e6, float:1.9694E-41)
            if (r0 != r2) goto L_0x2e79
            android.content.Context r5 = r1.A00
            X.0i6 r2 = X.C63913ic.A0E(r1)
            com.instagram.service.session.UserSession r24 = X.C05030Qo.A02(r2)
            X.0kW r22 = X.C63913ic.A09(r1)
            java.lang.Object r4 = X.AnonymousClass7K7.A04(r1, r3)
            X.MLo r4 = (X.C41453MLo) r4
            if (r4 == 0) goto L_0x33e4
            r20 = 0
            r25 = 0
            X.9t8 r19 = new X.9t8
            r26 = r25
            r21 = r5
            r23 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            X.9Uc r2 = new X.9Uc
            r25 = r2
            r26 = r5
            r27 = r4
            r28 = r22
            r29 = r1
            r30 = r3
            r31 = r19
            r32 = r24
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0795
        L_0x2e79:
            r2 = 13376(0x3440, float:1.8744E-41)
            if (r0 != r2) goto L_0x2e93
            X.0i6 r5 = X.C63913ic.A0E(r1)
            X.C18200wM.A1R(r5)
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            java.lang.Object r4 = X.AnonymousClass7K7.A03(r1, r3)
            X.6m9 r4 = (X.C110716m9) r4
            X.5zY r2 = new X.5zY
            r2.<init>(r4, r1, r3, r5)
            goto L_0x0795
        L_0x2e93:
            r2 = 13377(0x3441, float:1.8745E-41)
            if (r0 != r2) goto L_0x2e9e
            X.5zH r2 = new X.5zH
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2e9e:
            r2 = 13378(0x3442, float:1.8747E-41)
            if (r0 != r2) goto L_0x2eac
            int r2 = r3.A02
            long r4 = (long) r2
            X.5fL r2 = new X.5fL
            r2.<init>(r4)
            goto L_0x0795
        L_0x2eac:
            r2 = 15892(0x3e14, float:2.227E-41)
            if (r0 != r2) goto L_0x2eb7
            X.9Ua r2 = new X.9Ua
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2eb7:
            r2 = 13380(0x3444, float:1.875E-41)
            if (r0 != r2) goto L_0x2ec2
            X.5zI r2 = new X.5zI
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2ec2:
            r2 = 13323(0x340b, float:1.867E-41)
            if (r0 != r2) goto L_0x2f1d
            X.C1190573i.A00()
            java.lang.String r2 = X.C37237Jn4.A02(r1, r3)
            if (r2 != 0) goto L_0x2f18
            r20 = 0
        L_0x2ed1:
            X.L1S r23 = X.C37237Jn4.A00(r1, r3)
            r2 = 63
            X.6jp r4 = r3.A0L(r2)
            if (r4 != 0) goto L_0x2f12
            r2 = 0
        L_0x2ede:
            r5 = 2131297456(0x7f0904b0, float:1.8212857E38)
            android.util.SparseArray r4 = r1.A01
            java.lang.Object r5 = r4.get(r5)
            X.7eg r10 = new X.7eg
            r10.<init>()
            if (r2 == 0) goto L_0x2ef3
            java.util.concurrent.CopyOnWriteArrayList r6 = r10.A00
            r6.add(r2)
        L_0x2ef3:
            if (r5 == 0) goto L_0x2efa
            java.util.concurrent.CopyOnWriteArrayList r2 = r10.A00
            r2.add(r5)
        L_0x2efa:
            X.IHN r24 = X.C37237Jn4.A01(r1, r3)
            if (r20 == 0) goto L_0x30d7
            r2 = 70
            r5 = 0
            java.lang.Object r2 = A0A(r3, r2)
            boolean r2 = X.AnonymousClass2LL.A00(r2, r5)
            if (r2 != 0) goto L_0x33eb
            java.lang.Class<X.7CI> r2 = X.AnonymousClass7CI.class
            monitor-enter(r2)
            goto L_0x30d3
        L_0x2f12:
            X.7eh r2 = new X.7eh
            r2.<init>(r1, r3, r4)
            goto L_0x2ede
        L_0x2f18:
            android.net.Uri r20 = X.C15430rJ.A01(r2)
            goto L_0x2ed1
        L_0x2f1d:
            r2 = 13399(0x3457, float:1.8776E-41)
            if (r0 != r2) goto L_0x2f28
            X.5zJ r2 = new X.5zJ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2f28:
            r2 = 13327(0x340f, float:1.8675E-41)
            if (r0 != r2) goto L_0x2f33
            X.5zK r2 = new X.5zK
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x2f33:
            r2 = 13387(0x344b, float:1.8759E-41)
            if (r0 != r2) goto L_0x312b
            java.lang.Object r10 = X.AnonymousClass7K7.A03(r1, r3)
            X.7qi r10 = (X.C130757qi) r10
            X.5fY r6 = r10.A02
            int r2 = r3.A02
            long r4 = (long) r2
            X.5fN r2 = new X.5fN
            r19 = r2
            r20 = r6
            r21 = r1
            r22 = r3
            r23 = r4
            r19.<init>(r20, r21, r22, r23)
            X.7he r4 = new X.7he
            r4.<init>(r10)
            goto L_0x2ad8
        L_0x2f58:
            int r2 = r3.A02
            X.5fM r2 = A07(r1, r2)
            X.7hb r4 = new X.7hb
            r4.<init>(r5)
            X.C86134wK.A1I(r4, r2, r3)
            goto L_0x0795
        L_0x2f68:
            X.0Ot r4 = X.C04690Os.A02     // Catch:{ IOException -> 0x303b }
            X.0Os r4 = r4.A04(r10, r5)     // Catch:{ IOException -> 0x303b }
            X.AUK r4 = X.C102296Uq.parseFromJson(r4)     // Catch:{ IOException -> 0x303b }
            if (r4 == 0) goto L_0x0795
            X.AgF r5 = X.C19294Atx.A01(r10, r4)     // Catch:{ IOException -> 0x303b }
            X.6lk r20 = X.AnonymousClass70B.A01(r1, r6, r10, r11)     // Catch:{ IOException -> 0x303b }
            if (r20 == 0) goto L_0x0795
            if (r5 == 0) goto L_0x0795
            java.lang.Integer r11 = r5.A02     // Catch:{ IOException -> 0x303b }
            java.lang.Integer r4 = X.AnonymousClass006.A01     // Catch:{ IOException -> 0x303b }
            if (r11 != r4) goto L_0x2f99
            X.9S4 r4 = new X.9S4     // Catch:{ IOException -> 0x303b }
            r19 = r4
            r21 = r1
            r22 = r3
            r23 = r6
            r24 = r10
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x303b }
            goto L_0x3038
        L_0x2f99:
            java.lang.Integer r4 = X.AnonymousClass006.A0Y     // Catch:{ IOException -> 0x303b }
            if (r11 != r4) goto L_0x2fb0
            X.9S1 r4 = new X.9S1     // Catch:{ IOException -> 0x303b }
            r19 = r4
            r21 = r1
            r22 = r3
            r23 = r6
            r24 = r10
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x303b }
            goto L_0x3038
        L_0x2fb0:
            java.lang.Integer r4 = X.AnonymousClass006.A0j     // Catch:{ IOException -> 0x303b }
            if (r11 != r4) goto L_0x0795
            r4 = r5
            X.9pG r4 = (X.C167279pG) r4     // Catch:{ IOException -> 0x303b }
            X.BKU r4 = r4.A00     // Catch:{ IOException -> 0x303b }
            boolean r4 = r4.BZm()     // Catch:{ IOException -> 0x303b }
            if (r4 == 0) goto L_0x2fd1
            X.9S3 r4 = new X.9S3     // Catch:{ IOException -> 0x303b }
            r19 = r4
            r21 = r1
            r22 = r3
            r23 = r6
            r24 = r10
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x303b }
            goto L_0x3038
        L_0x2fd1:
            X.9S2 r4 = new X.9S2     // Catch:{ IOException -> 0x303b }
            r19 = r4
            r21 = r1
            r22 = r3
            r23 = r6
            r24 = r10
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x303b }
            goto L_0x3038
        L_0x2fe3:
            r13 = move-exception
            java.lang.String r12 = "CollectionBinderUtils"
            java.lang.String r10 = "Invalid dimension for fading edge length"
            X.C30967GcS.A01(r1, r12, r10, r13, r2)
        L_0x2feb:
            r4.A01 = r2
            r10 = 66
            r2 = -1
            int r2 = r3.A0H(r10, r2)
            r4.A03 = r2
            r2 = 95
            java.lang.Object r2 = A0A(r3, r2)
            boolean r2 = X.AnonymousClass2LL.A00(r2, r6)
            r4.A0B = r2
            r2 = 98
            java.lang.Object r2 = A0A(r3, r2)
            boolean r2 = X.AnonymousClass2LL.A00(r2, r6)
            r4.A0A = r2
            X.6n2 r6 = r5.A03
            X.6hn r5 = new X.6hn
            r2 = r21
            r5.<init>(r1, r2)
            X.7hn r2 = new X.7hn
            r2.<init>(r5, r6)
            X.C86124wJ.A1N(r2, r4)
            r2 = 65
            java.lang.String r5 = X.C86114wI.A0m(r11, r2)
            if (r5 == 0) goto L_0x3038
            java.lang.String r2 = "on_drag"
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x3038
            r5 = 2
            androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2 r2 = new androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2
            r2.<init>(r1, r5)
            r4.A0O(r2)
        L_0x3038:
            r2 = r4
            goto L_0x0795
        L_0x303b:
            r10 = move-exception
            java.lang.String r6 = "CPDP_MVP_HEROCAROUSEL"
            java.lang.String r5 = "CPDPHeroCarouselVideoComponent createRenderUnit failed to parse the right model."
            r4 = 0
            X.C30967GcS.A01(r1, r6, r5, r10, r4)
            goto L_0x0795
        L_0x3046:
            int r11 = r3.A0H(r6, r4)     // Catch:{ IOException -> 0x0795 }
            X.0Ot r4 = X.C04690Os.A02     // Catch:{ IOException -> 0x0795 }
            X.0Os r4 = r4.A04(r5, r10)     // Catch:{ IOException -> 0x0795 }
            X.AUK r4 = X.C102296Uq.parseFromJson(r4)     // Catch:{ IOException -> 0x0795 }
            X.AgF r4 = X.C19294Atx.A01(r5, r4)     // Catch:{ IOException -> 0x0795 }
            if (r4 == 0) goto L_0x0795
            java.lang.Integer r10 = r4.A02     // Catch:{ IOException -> 0x0795 }
            java.lang.Integer r6 = X.AnonymousClass006.A01     // Catch:{ IOException -> 0x0795 }
            if (r10 != r6) goto L_0x3082
            X.BKe r22 = new X.BKe     // Catch:{ IOException -> 0x0795 }
            r22.<init>()     // Catch:{ IOException -> 0x0795 }
            X.9pF r4 = (X.C167269pF) r4     // Catch:{ IOException -> 0x0795 }
            X.9S7 r19 = new X.9S7     // Catch:{ IOException -> 0x0795 }
            r20 = r1
            r21 = r3
            r23 = r5
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0795 }
        L_0x3074:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0795 }
            java.util.HashMap r5 = X.C103566Zr.A01     // Catch:{ IOException -> 0x0795 }
            java.lang.ref.WeakReference r4 = X.C86144wL.A0w(r19)     // Catch:{ IOException -> 0x0795 }
            r5.put(r6, r4)     // Catch:{ IOException -> 0x0795 }
            goto L_0x30cf
        L_0x3082:
            java.lang.Integer r6 = X.AnonymousClass006.A0Y     // Catch:{ IOException -> 0x0795 }
            if (r10 != r6) goto L_0x309b
            X.BKe r22 = new X.BKe     // Catch:{ IOException -> 0x0795 }
            r22.<init>()     // Catch:{ IOException -> 0x0795 }
            X.9pE r4 = (X.C167259pE) r4     // Catch:{ IOException -> 0x0795 }
            X.9S5 r19 = new X.9S5     // Catch:{ IOException -> 0x0795 }
            r20 = r1
            r21 = r3
            r23 = r5
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0795 }
            goto L_0x3074
        L_0x309b:
            java.lang.Integer r6 = X.AnonymousClass006.A0j     // Catch:{ IOException -> 0x0795 }
            if (r10 != r6) goto L_0x0795
            X.9pG r4 = (X.C167279pG) r4     // Catch:{ IOException -> 0x0795 }
            X.BKU r6 = r4.A00     // Catch:{ IOException -> 0x0795 }
            boolean r6 = r6.BZm()     // Catch:{ IOException -> 0x0795 }
            if (r6 == 0) goto L_0x30bc
            X.BKe r22 = new X.BKe     // Catch:{ IOException -> 0x0795 }
            r22.<init>()     // Catch:{ IOException -> 0x0795 }
            X.9S8 r19 = new X.9S8     // Catch:{ IOException -> 0x0795 }
            r20 = r1
            r21 = r3
            r23 = r5
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0795 }
            goto L_0x3074
        L_0x30bc:
            X.BKe r22 = new X.BKe     // Catch:{ IOException -> 0x0795 }
            r22.<init>()     // Catch:{ IOException -> 0x0795 }
            X.9S6 r19 = new X.9S6     // Catch:{ IOException -> 0x0795 }
            r20 = r1
            r21 = r3
            r23 = r5
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0795 }
            goto L_0x3074
        L_0x30cf:
            r2 = r19
            goto L_0x0795
        L_0x30d3:
            X.AnonymousClass7CI.A01()     // Catch:{ all -> 0x33fe }
            monitor-exit(r2)
        L_0x30d7:
            java.util.Map r11 = X.AnonymousClass6X7.A00
            r2 = 2131297452(0x7f0904ac, float:1.821285E38)
            java.lang.Object r5 = r4.get(r2)
            com.facebook.common.callercontext.ContextChain r5 = (com.facebook.common.callercontext.ContextChain) r5
            java.lang.String r4 = "i"
            java.lang.String r2 = "BloksImageComponent"
            com.facebook.common.callercontext.ContextChain r6 = new com.facebook.common.callercontext.ContextChain
            r6.<init>(r5, r4, r2, r11)
            r4 = 73
            android.util.SparseArray r2 = r3.A04
            java.lang.String r12 = X.C86114wI.A0m(r2, r4)
            if (r12 == 0) goto L_0x3102
            java.lang.String r11 = "serialized_tag"
            java.lang.String r5 = "serialized_name"
            r4 = 0
            com.facebook.common.callercontext.ContextChain r2 = new com.facebook.common.callercontext.ContextChain
            r2.<init>(r6, r11, r5, r4)
            r2.A00 = r12
            r6 = r2
        L_0x3102:
            int r2 = r3.A02
            long r4 = (long) r2
            java.util.concurrent.CopyOnWriteArrayList r2 = r10.A00
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x310e
            r10 = 0
        L_0x310e:
            X.5fP r2 = new X.5fP
            r19 = r2
            r21 = r6
            r22 = r10
            r25 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25)
            java.lang.String r5 = X.C37237Jn4.A02(r1, r3)
            if (r5 == 0) goto L_0x0795
            X.7hV r4 = new X.7hV
            r4.<init>()
            X.C86134wK.A1I(r4, r2, r5)
            goto L_0x0795
        L_0x312b:
            r2 = 15727(0x3d6f, float:2.2038E-41)
            if (r0 != r2) goto L_0x3136
            X.IgY r2 = new X.IgY
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3136:
            r2 = 13388(0x344c, float:1.876E-41)
            if (r0 != r2) goto L_0x3141
            X.5zL r2 = new X.5zL
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3141:
            r2 = 13408(0x3460, float:1.8789E-41)
            if (r0 != r2) goto L_0x314c
            X.5zM r2 = new X.5zM
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x314c:
            r2 = 13390(0x344e, float:1.8763E-41)
            if (r0 != r2) goto L_0x3157
            X.1jU r2 = new X.1jU
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3157:
            r2 = 13391(0x344f, float:1.8765E-41)
            if (r0 != r2) goto L_0x3162
            X.1jV r2 = new X.1jV
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3162:
            r2 = 15900(0x3e1c, float:2.228E-41)
            if (r0 != r2) goto L_0x316d
            X.9Ub r2 = new X.9Ub
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x316d:
            r2 = 13546(0x34ea, float:1.8982E-41)
            if (r0 != r2) goto L_0x3178
            X.5zZ r2 = new X.5zZ
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3178:
            r2 = 13944(0x3678, float:1.954E-41)
            if (r0 != r2) goto L_0x3183
            X.5zb r2 = new X.5zb
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3183:
            r2 = 13635(0x3543, float:1.9107E-41)
            if (r0 != r2) goto L_0x318e
            X.5zU r2 = new X.5zU
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x318e:
            r2 = 13648(0x3550, float:1.9125E-41)
            if (r0 != r2) goto L_0x3199
            X.5zN r2 = new X.5zN
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3199:
            r2 = 16053(0x3eb5, float:2.2495E-41)
            if (r0 != r2) goto L_0x31b1
            java.lang.String r2 = X.C18230wP.A0o(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ 1
            X.AnonymousClass7Ko.A0B(r2)
            X.FPa r2 = new X.FPa
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x31b1:
            r2 = 13955(0x3683, float:1.9555E-41)
            if (r0 == r2) goto L_0x3215
            r2 = 13617(0x3531, float:1.9081E-41)
            if (r0 != r2) goto L_0x31c0
            X.5ze r2 = new X.5ze
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x31c0:
            r2 = 16586(0x40ca, float:2.3242E-41)
            if (r0 != r2) goto L_0x31db
            java.lang.Object r4 = X.AnonymousClass7K7.A03(r1, r3)
            r2 = 22
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r4 = X.C86154wM.A0y(r1, r3, r4, r2)
            X.5fI r2 = new X.5fI
            r2.<init>(r4)
            int r4 = r3.A02
            long r4 = (long) r4
            r2.A0O(r4)
            goto L_0x0795
        L_0x31db:
            r2 = 13666(0x3562, float:1.915E-41)
            if (r0 != r2) goto L_0x31e6
            X.5z6 r2 = new X.5z6
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x31e6:
            r2 = 16229(0x3f65, float:2.2742E-41)
            if (r0 != r2) goto L_0x31f1
            X.5z7 r2 = new X.5z7
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x31f1:
            r2 = 13708(0x358c, float:1.9209E-41)
            if (r0 != r2) goto L_0x31fc
            X.5z8 r2 = new X.5z8
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x31fc:
            r2 = 16444(0x403c, float:2.3043E-41)
            if (r0 != r2) goto L_0x3207
            X.5zX r2 = new X.5zX
            r2.<init>(r1, r3)
            goto L_0x0795
        L_0x3207:
            r2 = 15770(0x3d9a, float:2.2098E-41)
            if (r0 != r2) goto L_0x3401
            int r2 = r3.A02
            long r4 = (long) r2
            X.5fb r2 = new X.5fb
            r2.<init>(r1, r3, r4)
            goto L_0x0795
        L_0x3215:
            int r2 = r3.A02
            X.5fM r2 = A07(r1, r2)
            goto L_0x0795
        L_0x321d:
            java.lang.String r0 = "Invalid pixel format for scroll indicator corner radius"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3224:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Width: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r14)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x322f:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Height: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r14)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x323a:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Radius: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r13)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3245:
            java.lang.String r0 = "Invalid pixel format for scroll indicator margin"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x324c:
            java.lang.String r0 = "Invalid pixel format for scroll indicator size"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3253:
            java.lang.String r0 = "Invalid snap style value"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x325a:
            java.lang.String r0 = "Invalid pixel format for left offset on snap"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3261:
            X.C06750aI.A19()     // Catch:{ 1zB -> 0x3265 }
            throw r19     // Catch:{ 1zB -> 0x3265 }
        L_0x3265:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x326c:
            java.lang.String r0 = "Invalid snap gravity value"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3273:
            java.lang.String r0 = "Error parsing scroll indicator's shadow opacity: it should be in range [0..1]"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x327a:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x3281:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3288:
            java.lang.String r0 = "ProgressBar binder returned a null ProgressBarView from createView"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x328f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x3295:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x329b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x32a1:
            java.lang.String r0 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32a8:
            java.lang.String r0 = "bk.cds.bottomsheet.Wrapper has no content."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32af:
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r10)
            throw r1
        L_0x32b4:
            java.lang.String r0 = "Popup container defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x32bb:
            java.lang.String r0 = "Popup cannot have more than 1 child element"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x32c2:
            java.lang.String r0 = "HeroCarouselTryInARRenderUnit received a null renderUnit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32c9:
            java.lang.String r0 = "CPDPLightBoxReelsVideoComponent received a null renderUnit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32d0:
            java.lang.String r0 = "PDPMediaGridStickyCtaComponent received a null renderUnit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32d7:
            java.lang.String r0 = "Button binder returns a null render unit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32de:
            java.lang.String r0 = "Media button binder returns a null render unit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32e5:
            java.lang.String r0 = "Text cell binder returns a null render unit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32ec:
            java.lang.String r0 = "Survey Media Content render unit is null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x32f3:
            java.lang.String r0 = "Expected configuration for measure but found none"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x32fa:
            java.lang.String r0 = "Expected content in screen wrapper but found none"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x3301:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x3306:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x330d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x3312:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3319:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3320:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3327:
            java.lang.String r0 = "A render unit was defined for this node but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x332e:
            java.lang.String r0 = "Screen wrapper has no child"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3335:
            java.lang.String r0 = "Expecting a valid Bloks context"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x333c:
            java.lang.String r0 = "Follow button binder returns a null render unit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3343:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x3349:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x334f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x3355:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x335b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x3361:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x3367:
            java.lang.String r0 = "PTR container has no child"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x336e:
            java.lang.String r0 = "Unspecified measures for IgStaticMapRenderUnit are not supported."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x3375:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x337a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x337f:
            java.lang.String r0 = "Product component in Product Tile Binder is null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3386:
            java.lang.String r0 = "Product Tile binder returns a null render unit or a null bloksContext"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x338d:
            java.lang.String r0 = "Product Tile binder returns a null render unit or a null bloksContext"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3394:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x339b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x33a0:
            java.lang.String r0 = " received a null renderUnit"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r0)
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x33ab:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x33b2:
            java.lang.String r0 = "Server should have ensured that the Tooltip always has a child."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x33b9:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x33bf:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r21)
            throw r1
        L_0x33c4:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r21)
            throw r1
        L_0x33c9:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r21)
            throw r1
        L_0x33ce:
            java.lang.Object[] r1 = X.C18210wN.A1X(r0)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x33dd:
            java.lang.String r0 = "Got null while trying to retrieve controller for video"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x33e4:
            java.lang.String r0 = "Controller was defined but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x33eb:
            java.lang.Class<X.7CI> r2 = X.AnonymousClass7CI.class
            monitor-enter(r2)
            X.AnonymousClass7CI.A01()     // Catch:{ all -> 0x33fe }
            monitor-exit(r2)
            monitor-enter(r2)
            X.AnonymousClass7CI.A01()     // Catch:{ all -> 0x33fe }
            monitor-exit(r2)
            java.lang.String r0 = "Image prefetching with Fresco Vito is disabled!"
            java.lang.UnsupportedOperationException r1 = X.C86134wK.A0s(r0)
            throw r1
        L_0x33fe:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x3401:
            java.lang.Object[] r1 = X.C18210wN.A1X(r0)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127397h3.ABY(X.6qV, int, int):X.MeD");
    }

    public C127397h3(int i) {
        this.A06 = null;
        this.A04 = C86154wM.A0D();
        this.A03 = i;
        this.A02 = AnonymousClass6YG.A00.incrementAndGet();
        this.A07 = null;
        this.A05 = null;
        AnonymousClass326.A03.incrementAndGet();
    }

    public C127397h3(C127397h3 r2, C127397h3 r3, List list, int i) {
        this.A06 = r2.A06;
        this.A04 = r2.A04.clone();
        this.A03 = r2.A03;
        this.A02 = i;
        this.A07 = list;
        this.A05 = r3;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        AnonymousClass326.A03.incrementAndGet();
    }

    public C127397h3(C127397h3 r2, C110016kz r3) {
        LinkedList linkedList = r2.A06;
        linkedList = linkedList == null ? new LinkedList() : linkedList;
        this.A06 = linkedList;
        linkedList.addFirst(r3);
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A07 = r2.A07;
        C127397h3 r0 = r2.A05;
        this.A05 = r0 == null ? null : r0;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        AnonymousClass326.A03.incrementAndGet();
    }
}
