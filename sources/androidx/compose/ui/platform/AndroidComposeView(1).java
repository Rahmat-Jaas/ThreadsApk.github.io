package androidx.compose.ui.platform;

import X.AnonymousClass006;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass50g;
import X.AnonymousClass50k;
import X.AnonymousClass50l;
import X.AnonymousClass50y;
import X.AnonymousClass54J;
import X.AnonymousClass54Q;
import X.AnonymousClass55K;
import X.AnonymousClass69J;
import X.AnonymousClass6Av;
import X.AnonymousClass6ER;
import X.AnonymousClass6F4;
import X.AnonymousClass6F6;
import X.AnonymousClass6FT;
import X.AnonymousClass78y;
import X.AnonymousClass7EA;
import X.AnonymousClass7F6;
import X.AnonymousClass7FL;
import X.AnonymousClass7FM;
import X.AnonymousClass7HO;
import X.AnonymousClass7Hf;
import X.AnonymousClass7Hh;
import X.AnonymousClass7JT;
import X.AnonymousClass7KC;
import X.AnonymousClass7WQ;
import X.AnonymousClass7WR;
import X.AnonymousClass7XA;
import X.AnonymousClass7XB;
import X.AnonymousClass7XD;
import X.AnonymousClass7XE;
import X.AnonymousClass7XN;
import X.AnonymousClass7Y3;
import X.AnonymousClass7YG;
import X.AnonymousClass7YP;
import X.AnonymousClass7YQ;
import X.AnonymousClass7YR;
import X.AnonymousClass7YS;
import X.AnonymousClass7YX;
import X.AnonymousClass7Z1;
import X.AnonymousClass7Z2;
import X.AnonymousClass7Z3;
import X.AnonymousClass7Z4;
import X.AnonymousClass7ZI;
import X.AnonymousClass84T;
import X.AnonymousClass84X;
import X.AnonymousClass8bA;
import X.AnonymousClass8bL;
import X.AnonymousClass8d6;
import X.AnonymousClass8d7;
import X.AnonymousClass8dC;
import X.AnonymousClass8dG;
import X.C006702y;
import X.C04220Ms;
import X.C104106bF;
import X.C104126bH;
import X.C106806fe;
import X.C106836fh;
import X.C106856fj;
import X.C106886fn;
import X.C108586ib;
import X.C111226mz;
import X.C111666o7;
import X.C112306pM;
import X.C112776qA;
import X.C112896qN;
import X.C112956qT;
import X.C113976sU;
import X.C114186sp;
import X.C114196sq;
import X.C114216ss;
import X.C115386uy;
import X.C115536vN;
import X.C115926w8;
import X.C116066wM;
import X.C1197076n;
import X.C121227Ew;
import X.C121637Hc;
import X.C121847Ik;
import X.C122397Rv;
import X.C123327Wm;
import X.C123367Wq;
import X.C123407Wu;
import X.C123447Wy;
import X.C123687Yc;
import X.C123697Yd;
import X.C123737Yh;
import X.C135047yn;
import X.C135057yo;
import X.C13790oJ;
import X.C138738Lg;
import X.C138978Me;
import X.C138988Mf;
import X.C14030oh;
import X.C141768cv;
import X.C141778cw;
import X.C141788cx;
import X.C141818d1;
import X.C142868fj;
import X.C142938fq;
import X.C142948fr;
import X.C143008fx;
import X.C143028fz;
import X.C143048g1;
import X.C143078g4;
import X.C146118lf;
import X.C146648mb;
import X.C146738mm;
import X.C146838mw;
import X.C147098nO;
import X.C147168nV;
import X.C147358pD;
import X.C147368pE;
import X.C147548pW;
import X.C147648pg;
import X.C147658ph;
import X.C147858q2;
import X.C15750rp;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C18250wR;
import X.C77954he;
import X.C77964hf;
import X.C77974hg;
import X.C86104wH;
import X.C86114wI;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C875153b;
import X.C875353d;
import X.C97396Be;
import X.I17;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.OnKeyEventElement;
import androidx.compose.ui.input.rotary.OnRotaryScrollEventElement;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape608S0100000_2_I2;
import com.facebook.redex.IDxLListenerShape382S0100000_2_I2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AndroidComposeView extends ViewGroup implements C147098nO, C147858q2, C142948fr, ViewRootForTest {
    public static Class A16;
    public static Method A17;
    public long A00;
    public long A01;
    public long A02;
    public MotionEvent A03;
    public C146738mm A04;
    public AnonymousClass50k A05;
    public C147168nV A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public long A0D;
    public long A0E = AnonymousClass7KC.A02;
    public AnonymousClass50l A0F;
    public Constraints A0G;
    public List A0H;
    public AnonymousClass0YY A0I;
    public AnonymousClass0YY A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N = true;
    public final C123367Wq A0O;
    public final C104106bF A0P;
    public final C147548pW A0Q;
    public final C142938fq A0R;
    public final AnonymousClass7XE A0S;
    public final C141788cx A0T;
    public final C1197076n A0U;
    public final AnonymousClass7Y3 A0V;
    public final AnonymousClass7XB A0W = new AnonymousClass7XB((AnonymousClass7XA) null, (DefaultConstructorMarker) null, 1);
    public final AnonymousClass7HO A0X;
    public final C112956qT A0Y;
    public final AnonymousClass7YP A0Z;
    public final AnonymousClass7YS A0a;
    public final C135057yo A0b;
    public final AndroidComposeViewAccessibilityDelegateCompat A0c;
    public final C143028fz A0d;
    public final C143048g1 A0e;
    public final C146118lf A0f;
    public final C106856fj A0g;
    public final C123697Yd A0h;
    public final C111666o7 A0i;
    public final AnonymousClass8d7 A0j;
    public final AnonymousClass7Z4 A0k;
    public final C106886fn A0l;
    public final float[] A0m;
    public final float[] A0n;
    public final ViewTreeObserver.OnGlobalLayoutListener A0o;
    public final ViewTreeObserver.OnScrollChangedListener A0p;
    public final ViewTreeObserver.OnTouchModeChangeListener A0q;
    public final C147368pE A0r;
    public final C147368pE A0s;
    public final C147368pE A0t;
    public final AnonymousClass84X A0u;
    public final Modifier A0v;
    public final Modifier A0w;
    public final C104126bH A0x;
    public final C112896qN A0y;
    public final C112776qA A0z;
    public final C141818d1 A10;
    public final AnonymousClass55K A11;
    public final Runnable A12;
    public final List A13;
    public final AnonymousClass0ZU A14;
    public final int[] A15;

    public AndroidComposeView(Context context) {
        super(context);
        int i;
        AnonymousClass69J r0;
        C143028fz r02;
        this.A06 = new AnonymousClass7ZI(C18230wP.A0E(context).density, C86114wI.A0B(context).fontScale);
        AnonymousClass55K r7 = new AnonymousClass55K(C77974hg.A00, InspectableValueKt.A00, false);
        this.A11 = r7;
        this.A0Q = new C123407Wu(C86154wM.A10(this, 39));
        this.A0h = new C123697Yd();
        C123327Wm r3 = Modifier.A00;
        Modifier Cx6 = r3.Cx6(new OnKeyEventElement(C86154wM.A10(this, 40)));
        this.A0v = Cx6;
        Modifier Cx62 = r3.Cx6(new OnRotaryScrollEventElement(C77964hf.A00));
        this.A0w = Cx62;
        this.A0x = new C104126bH();
        AnonymousClass7Y3 r32 = new AnonymousClass7Y3(false, AnonymousClass55K.A01.addAndGet(1));
        r32.Cmu(AnonymousClass54Q.A00);
        r32.CkD(this.A06);
        r32.Cn8(Modifier.A07(AnonymousClass6ER.A00(r7, Cx62), ((C123407Wu) this.A0Q).A02, Cx6));
        this.A0V = r32;
        this.A10 = this;
        this.A0i = new C111666o7(r32);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0c = androidComposeViewAccessibilityDelegateCompat;
        this.A0P = new C104106bF();
        this.A13 = AnonymousClass0wJ.A0v();
        this.A0y = new C112896qN();
        this.A0z = new C112776qA(this.A0V);
        this.A0I = C77954he.A00;
        this.A0O = new C123367Wq(this, this.A0P);
        this.A0a = new AnonymousClass7YS(context);
        this.A0Z = new AnonymousClass7YP(context);
        this.A0Y = new C112956qT(C86154wM.A10(this, 41));
        this.A0X = new AnonymousClass7HO(this.A0V);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C04220Ms.A06(viewConfiguration);
        this.A0f = new C123687Yc(viewConfiguration);
        this.A0D = AnonymousClass7Hh.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.A15 = new int[]{0, 0};
        this.A0m = AnonymousClass7Hf.A04();
        this.A0n = AnonymousClass7Hf.A04();
        this.A00 = -1;
        this.A02 = AnonymousClass7KC.A01;
        this.A08 = true;
        AnonymousClass7WR r72 = AnonymousClass7WR.A00;
        this.A0t = C86104wH.A0I(r72, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0o = new IDxLListenerShape382S0100000_2_I2(this, 0);
        this.A0p = new IDxCListenerShape608S0100000_2_I2(this, 0);
        this.A0q = new C122397Rv(this);
        AnonymousClass7Z4 r10 = new AnonymousClass7Z4(C86164wN.A0u(this, 22));
        this.A0k = r10;
        AnonymousClass7Z3 r9 = AnonymousClass7Z3.A00;
        AnonymousClass84T r8 = r10.A01;
        C108586ib r2 = (C108586ib) r8.get(r9);
        if (r2 == null) {
            Object invoke = r10.A02.invoke(r9, new AnonymousClass7Z1(r9, r10));
            C04220Ms.A0C(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
            r2 = new C108586ib((AnonymousClass8dC) invoke, r10);
            r8.put(r9, r2);
        }
        C147368pE r1 = r2.A00;
        C147368pE.A03(r1, AnonymousClass0wJ.A04(r1.getValue()) + 1);
        this.A0l = ((AnonymousClass7Z2) r2.A01).A00;
        this.A0j = new C123737Yh(context);
        this.A0r = C86104wH.A0I(AnonymousClass7WQ.A00, new FontFamilyResolverImpl(new AndroidFontLoader(context), AnonymousClass6FT.A00(context)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        Configuration A0B2 = C86114wI.A0B(context);
        C04220Ms.A06(A0B2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            i = A0B2.fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.A0C = i;
        Configuration A0B3 = C86114wI.A0B(context);
        C04220Ms.A06(A0B3);
        int layoutDirection = A0B3.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection != 1) {
            r0 = AnonymousClass69J.Ltr;
        } else {
            r0 = AnonymousClass69J.Rtl;
        }
        this.A0s = C86104wH.A0I(r72, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0R = new AnonymousClass7XD(this);
        this.A0S = new AnonymousClass7XE(C86164wN.A04(isInTouchMode() ? 1 : 0), C86154wM.A10(this, 38));
        this.A0U = new C1197076n(this);
        this.A0e = new AnonymousClass7YX(this);
        this.A0g = new C106856fj();
        this.A0u = AnonymousClass84X.A01(new AnonymousClass0ZU[16]);
        this.A0b = new C135057yo(this);
        this.A12 = new C135047yn(this);
        this.A14 = C86154wM.A13(this, 27);
        if (i2 >= 29) {
            r02 = new AnonymousClass7YQ();
        } else {
            r02 = new AnonymousClass7YR();
        }
        this.A0d = r02;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusable(1);
        setDefaultFocusHighlightEnabled(false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C006702y.A0C(this, androidComposeViewAccessibilityDelegateCompat);
        this.A0V.A0M(this);
        if (i2 >= 29) {
            AnonymousClass6F6.A00(this);
        }
        this.A0T = new AnonymousClass7XN(this);
    }

    public static final void A04(MotionEvent motionEvent, AndroidComposeView androidComposeView, int i, long j, boolean z) {
        AndroidComposeView androidComposeView2;
        int buttonState;
        long downTime;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        int i4 = i;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (!(i4 == 9 || i4 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (C86114wI.A1S(i3) ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i6 = 0; i6 < pointerCount; i6++) {
                pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
            }
            int i7 = 0;
            while (true) {
                androidComposeView2 = androidComposeView;
                if (i7 >= pointerCount) {
                    break;
                }
                if (i3 >= 0) {
                    i2 = 1;
                    if (i7 >= i3) {
                        int i8 = i2 + i7;
                        motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                        motionEvent.getPointerCoords(i8, pointerCoords);
                        long Bb1 = androidComposeView.Bb1(C86104wH.A0C(pointerCoords.x, pointerCoords.y));
                        pointerCoords.x = AnonymousClass7KC.A01(Bb1);
                        pointerCoords.y = AnonymousClass7KC.A02(Bb1);
                        i7++;
                    }
                }
                i2 = 0;
                int i82 = i2 + i7;
                motionEvent.getPointerProperties(i82, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i7];
                motionEvent.getPointerCoords(i82, pointerCoords2);
                long Bb12 = androidComposeView.Bb1(C86104wH.A0C(pointerCoords2.x, pointerCoords2.y));
                pointerCoords2.x = AnonymousClass7KC.A01(Bb12);
                pointerCoords2.y = AnonymousClass7KC.A02(Bb12);
                i7++;
            }
            if (z) {
                buttonState = 0;
            } else {
                buttonState = motionEvent.getButtonState();
            }
            long j2 = j;
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                downTime = j2;
            } else {
                downTime = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(downTime, j2, i4, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags());
            C112896qN r0 = androidComposeView2.A0y;
            C04220Ms.A06(obtain);
            C106806fe A002 = r0.A00(obtain, androidComposeView2);
            C04220Ms.A0A(A002);
            androidComposeView2.A0z.A00(A002, androidComposeView2, true);
            obtain.recycle();
        }
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public final void Bg6(AnonymousClass7Y3 r8, long j) {
        AnonymousClass7HO r5;
        C04220Ms.A0B(r8, 0);
        C13790oJ.A01("AndroidOwner:measureAndLayout", 1618529064);
        try {
            r5 = this.A0X;
            AnonymousClass7Y3 r2 = r5.A04;
            if (!(!r8.equals(r2))) {
                throw C18190wL.A0a("Failed requirement.");
            } else if (r2.A0A == null) {
                throw C18190wL.A0a("Failed requirement.");
            } else if (!r2.A0N) {
                throw C18190wL.A0a("Failed requirement.");
            } else if (!r5.A01) {
                if (r5.A00 != null) {
                    r5.A01 = true;
                    r5.A03.A01(r8);
                    AnonymousClass7HO.A02(r8, r5, new Constraints(j));
                    C113976sU r1 = r8.A0Y;
                    if (!r1.A04 || !C18190wL.A1Z((Object) null, true)) {
                        if (r1.A02 && r8.A0N) {
                            r8.A0H();
                            r5.A05.A00.A0C(r8);
                            r8.A0O = true;
                        }
                        r5.A01 = false;
                    } else {
                        if (r8.A0F == AnonymousClass006.A0C) {
                            AnonymousClass7Y3.A03(r8);
                        }
                        C04220Ms.A0A((Object) null);
                        throw null;
                    }
                }
                AnonymousClass84X r4 = r5.A02;
                int i = r4.A00;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = r4.A01;
                    do {
                        ((C143008fx) objArr[i2]).C4L();
                        i2++;
                    } while (i2 < i);
                }
                r4.A05();
                r5.A04(false);
                C13790oJ.A00(642791449);
            } else {
                throw C18190wL.A0a("Failed requirement.");
            }
        } catch (Throwable th) {
            C13790oJ.A00(-1499958399);
            throw th;
        }
    }

    public final /* synthetic */ void BsJ(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void Btb(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void CAO(AnonymousClass066 r1) {
    }

    public final void CaB(AnonymousClass0ZU r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass84X r1 = this.A0u;
        if (!r1.A0D(r3)) {
            r1.A0C(r3);
        }
    }

    public final void autofill(SparseArray sparseArray) {
        C04220Ms.A0B(sparseArray, 0);
        C123367Wq r5 = this.A0O;
        if (r5 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                C04220Ms.A04(autofillValue);
                if (autofillValue.isText()) {
                    C104106bF r2 = r5.A02;
                    CharSequence textValue = autofillValue.getTextValue();
                    C04220Ms.A06(textValue);
                    C04220Ms.A0B(textValue.toString(), 1);
                    r2.A00.get(Integer.valueOf(keyAt));
                } else if (autofillValue.isDate()) {
                    throw C97396Be.A00("b/138604541: Add onFill() callback for date");
                } else if (autofillValue.isList()) {
                    throw C97396Be.A00("b/138604541: Add onFill() callback for list");
                } else if (autofillValue.isToggle()) {
                    throw C97396Be.A00("b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        if (!isAttachedToWindow()) {
            A06(this.A0V);
        }
        Bg5(true);
        this.A0L = true;
        C123447Wy r2 = this.A0x.A00;
        Canvas canvas2 = r2.A00;
        r2.A00 = canvas;
        this.A0V.A0a.A04.A0T(r2);
        r2.A00 = canvas2;
        List list = this.A13;
        if (C18190wL.A1a(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C146648mb) list.get(i)).D94();
            }
        }
        if (AnonymousClass50g.A0H) {
            int save = canvas.save();
            canvas.clipRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0L = false;
        List list2 = this.A0H;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        List A042;
        C04220Ms.A0B(motionEvent, 0);
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                motionEvent.getAxisValue(26);
                getContext();
                viewConfiguration.getScaledVerticalScrollFactor();
                getContext();
                viewConfiguration.getScaledHorizontalScrollFactor();
                motionEvent.getEventTime();
                C875353d A002 = AnonymousClass7FM.A00(((C123407Wu) this.A0Q).A00);
                if (A002 == null) {
                    return false;
                }
                AnonymousClass7YG A003 = C121847Ik.A00(A002, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                if (!(A003 instanceof C147658ph) || A003 == null || (A042 = C121847Ik.A04(A003, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET)) == null) {
                    return false;
                }
                int A0B2 = C86104wH.A0B(A042);
                if (A0B2 >= 0) {
                    while (true) {
                        int i = A0B2 - 1;
                        A042.get(A0B2);
                        if (i < 0) {
                            break;
                        }
                        A0B2 = i;
                    }
                }
                int size = A042.size();
                for (int i2 = 0; i2 < size; i2++) {
                    A042.get(i2);
                }
                return false;
            } else if (!A0C(motionEvent) && isAttachedToWindow()) {
                if ((A00(motionEvent) & 1) != 0) {
                    return true;
                }
                return false;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r1 = new X.AnonymousClass7HT(X.C121847Ik.A01(r8), r8, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r3 = 0
            r2 = r20
            X.C04220Ms.A0B(r2, r3)
            r5 = r19
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0014
            java.lang.Runnable r0 = r5.A12
            r5.removeCallbacks(r0)
            r0.run()
        L_0x0014:
            boolean r0 = A0C(r2)
            if (r0 != 0) goto L_0x0143
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L_0x0143
            r0 = 4098(0x1002, float:5.743E-42)
            boolean r0 = r2.isFromSource(r0)
            r4 = 1
            if (r0 == 0) goto L_0x00fc
            int r0 = r2.getToolType(r3)
            if (r0 != r4) goto L_0x00fc
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = r5.A0c
            android.view.accessibility.AccessibilityManager r1 = r5.A0K
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0141
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x0141
            int r1 = r2.getAction()
            r0 = 7
            r11 = 1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x005d
            r0 = 9
            if (r1 == r0) goto L_0x005d
            r0 = 10
            if (r1 != r0) goto L_0x0141
            int r1 = r5.A02
            if (r1 == r6) goto L_0x00f1
            r5.A02 = r6
            r0 = 256(0x100, float:3.59E-43)
            X.C86114wI.A18(r5, r1, r0)
        L_0x005c:
            return r11
        L_0x005d:
            float r1 = r2.getX()
            float r0 = r2.getY()
            androidx.compose.ui.platform.AndroidComposeView r7 = r5.A0M
            r8 = 0
            r7.Bg5(r4)
            X.84G r13 = new X.84G
            r13.<init>()
            X.7Y3 r9 = r7.A0V
            long r0 = X.C86104wH.A0C(r1, r0)
            X.7IW r10 = r9.A0a
            X.54T r9 = r10.A04
            long r15 = r9.A0J(r0)
            X.54T r12 = r10.A04
            X.8le r14 = X.AnonymousClass54T.A0M
            r18 = r4
            r17 = r4
            r12.A0W(r13, r14, r15, r17, r18)
            java.lang.Object r0 = X.AnonymousClass00J.A0F(r13)
            X.8pt r0 = (X.C147778pt) r0
            if (r0 == 0) goto L_0x0099
            X.7Y3 r0 = X.C121847Ik.A01(r0)
            X.8pp r8 = X.AnonymousClass7FT.A01(r0)
        L_0x0099:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == 0) goto L_0x00d2
            X.7Y3 r0 = X.C121847Ik.A01(r8)
            X.7HT r1 = new X.7HT
            r1.<init>(r0, r8, r3)
            X.54T r0 = r1.A06()
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.A0X()
            if (r0 != 0) goto L_0x00d2
        L_0x00b2:
            X.7yX r1 = r1.A05
            X.77Z r0 = X.C103986b3.A0B
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x00d2
            X.7Y3 r1 = X.C121847Ik.A01(r8)
            X.50l r0 = r7.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x00d2
            int r0 = r1.A0W
            int r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r5, r0)
        L_0x00d2:
            X.50l r0 = r7.getAndroidViewsHandler$ui_release()
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            int r1 = r5.A02
            if (r1 == r4) goto L_0x00ee
            r5.A02 = r4
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r6) goto L_0x00e7
            X.C86114wI.A18(r5, r4, r0)
        L_0x00e7:
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r6) goto L_0x00ee
            X.C86114wI.A18(r5, r1, r0)
        L_0x00ee:
            if (r4 != r6) goto L_0x005c
            return r2
        L_0x00f1:
            androidx.compose.ui.platform.AndroidComposeView r0 = r5.A0M
            X.50l r0 = r0.getAndroidViewsHandler$ui_release()
            boolean r11 = r0.dispatchGenericMotionEvent(r2)
            return r11
        L_0x00fc:
            int r1 = r2.getActionMasked()
            r0 = 7
            if (r1 == r0) goto L_0x0130
            r0 = 10
            if (r1 != r0) goto L_0x0137
            boolean r0 = r5.A0A(r2)
            if (r0 == 0) goto L_0x0137
            int r1 = r2.getToolType(r3)
            r0 = 3
            if (r1 == r0) goto L_0x0129
            android.view.MotionEvent r0 = r5.A03
            if (r0 == 0) goto L_0x011b
            r0.recycle()
        L_0x011b:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r2)
            r5.A03 = r0
            r5.A07 = r4
            java.lang.Runnable r0 = r5.A12
            r5.post(r0)
            return r3
        L_0x0129:
            int r0 = r2.getButtonState()
            if (r0 == 0) goto L_0x0137
            return r3
        L_0x0130:
            boolean r0 = r5.A0B(r2)
            if (r0 != 0) goto L_0x0137
            return r3
        L_0x0137:
            int r0 = r5.A00(r2)
            r11 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0141
            return r11
        L_0x0141:
            r11 = 0
            return r11
        L_0x0143:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C04220Ms.A0B(keyEvent, 0);
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C123697Yd.A01.CrC(new C114216ss(keyEvent.getMetaState()));
        C875353d A002 = AnonymousClass7FM.A00(((C123407Wu) this.A0Q).A00);
        if (A002 != null) {
            AnonymousClass7YG r2 = A002.A03;
            if (r2.A08) {
                C147648pg r5 = null;
                if ((r2.A00 & 9216) != 0) {
                    while (true) {
                        r2 = r2.A02;
                        if (r2 != null) {
                            if ((r2.A01 & 9216) != 0) {
                                if ((r2.A01 & 1024) != 0) {
                                    break;
                                } else if (r2 instanceof C147648pg) {
                                    r5 = r2;
                                } else {
                                    throw C18180wK.A0a("Check failed.");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
                C147648pg r52 = r5;
                List list = null;
                if (r52 == null) {
                    AnonymousClass7YG A003 = C121847Ik.A00(A002, 8192);
                    if (!(A003 instanceof C147648pg)) {
                        A003 = null;
                    }
                    r52 = (C147648pg) A003;
                    if (r52 == null) {
                        return false;
                    }
                }
                List A042 = C121847Ik.A04(r52, 8192);
                if (A042 != null) {
                    list = A042;
                    int A0B2 = C86104wH.A0B(A042);
                    if (A0B2 >= 0) {
                        while (true) {
                            int i = A0B2 - 1;
                            AnonymousClass0YY r1 = ((C875153b) ((C147648pg) A042.get(A0B2))).A01;
                            if (r1 == null || !AnonymousClass0wJ.A1X(r1.invoke(new C114196sq(keyEvent)))) {
                                if (i < 0) {
                                    break;
                                }
                                A0B2 = i;
                            } else {
                                return true;
                            }
                        }
                    }
                }
                C875153b r53 = (C875153b) r52;
                AnonymousClass0YY r12 = r53.A01;
                if (r12 != null && AnonymousClass0wJ.A1X(r12.invoke(new C114196sq(keyEvent)))) {
                    return true;
                }
                AnonymousClass0YY r13 = r53.A00;
                if (r13 != null && AnonymousClass0wJ.A1X(r13.invoke(new C114196sq(keyEvent)))) {
                    return true;
                }
                if (list == null) {
                    return false;
                }
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass0YY r14 = ((C875153b) ((C147648pg) list.get(i2))).A00;
                    if (r14 != null && AnonymousClass0wJ.A1X(r14.invoke(new C114196sq(keyEvent)))) {
                        return true;
                    }
                }
                return false;
            }
            throw C18180wK.A0a("Check failed.");
        }
        throw C18180wK.A0a("Event can't be processed because we do not have an active focus target.");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        C04220Ms.A0B(motionEvent, 0);
        if (this.A07) {
            Runnable runnable = this.A12;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A03;
            C04220Ms.A0A(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A07 = false;
            } else {
                runnable.run();
            }
        }
        if (!A0C(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || A0B(motionEvent))) {
            int A002 = A00(motionEvent);
            if ((A002 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            z = true;
            if ((A002 & 1) == 0) {
                return false;
            }
        }
        return z;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return A02(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, C18210wN.A1X(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void getFocusedRect(Rect rect) {
        AnonymousClass7F6 A022;
        C04220Ms.A0B(rect, 0);
        C875353d A002 = AnonymousClass7FM.A00(((C123407Wu) this.A0Q).A00);
        if (A002 == null || (A022 = AnonymousClass7FM.A02(A002)) == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = AnonymousClass8bA.A02(A022.A01);
        rect.top = AnonymousClass8bA.A02(A022.A03);
        rect.right = AnonymousClass8bA.A02(A022.A02);
        rect.bottom = AnonymousClass8bA.A02(A022.A00);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        C04220Ms.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        C04220Ms.A06(context);
        this.A06 = new AnonymousClass7ZI(C18230wP.A0E(context).density, C86114wI.A0B(context).fontScale);
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.A0C) {
            this.A0C = i;
            getContext();
            setFontFamilyResolver(new FontFamilyResolverImpl(new AndroidFontLoader(context), AnonymousClass6FT.A00(context)));
        }
        this.A0I.invoke(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            r10 = this;
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            X.7Z4 r0 = r10.A0k
            X.84T r1 = r0.A01
            X.8dD r0 = r0.A00
            java.lang.Object r0 = r1.get(r0)
            X.6ib r0 = (X.C108586ib) r0
            if (r0 == 0) goto L_0x00a0
            X.8dC r0 = r0.A01
            X.7Z2 r0 = (X.AnonymousClass7Z2) r0
            X.7Z5 r3 = r0.A01
            X.79l r9 = r3.A01
            X.7HD r5 = r3.A02
            r8 = 1
            X.C04220Ms.A0B(r9, r8)
            r7 = 2
            boolean r6 = X.AnonymousClass0wJ.A1T(r8, r8)
            r4 = 3
            r2 = 6
            if (r6 == 0) goto L_0x0099
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x002e
            r2 = 0
        L_0x002e:
            r11.imeOptions = r2
            r11.inputType = r8
            r1 = 1
            if (r0 != 0) goto L_0x0044
            r0 = 131073(0x20001, float:1.83672E-40)
            r11.inputType = r0
            r1 = 131073(0x20001, float:1.83672E-40)
            if (r6 == 0) goto L_0x0044
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r0
            r11.imeOptions = r2
        L_0x0044:
            int r0 = r9.A00
            if (r0 != r8) goto L_0x008f
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L_0x004a:
            r11.inputType = r1
        L_0x004c:
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r11.inputType = r1
            long r1 = r5.A00
            int r0 = X.C86104wH.A07(r1)
            r11.initialSelStart = r0
            int r0 = X.C86104wH.A08(r1)
            r11.initialSelEnd = r0
            X.7yH r0 = r5.A01
            java.lang.String r0 = r0.A00
            X.AnonymousClass048.A00(r11, r0)
            int r1 = r11.imeOptions
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r11.imeOptions = r1
            X.Jmx r0 = X.C37231Jmx.A09
            if (r0 == 0) goto L_0x0079
            X.Jmx r0 = X.C37231Jmx.A00()
            r0.A04(r11)
        L_0x0079:
            X.7HD r1 = r3.A02
            X.7Yx r0 = new X.7Yx
            r0.<init>(r3)
            X.7S0 r2 = new X.7S0
            r2.<init>(r0, r1)
            java.util.List r1 = r3.A04
            java.lang.ref.WeakReference r0 = X.C86144wL.A0w(r2)
            r1.add(r0)
            return r2
        L_0x008f:
            if (r0 != r7) goto L_0x0094
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x004a
        L_0x0094:
            if (r0 != r4) goto L_0x004c
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L_0x004a
        L_0x0099:
            java.lang.String r0 = "invalid ImeAction"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00a0:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDraw(Canvas canvas) {
    }

    public final void setConfigurationChangeObserver(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        this.A0I = r2;
    }

    public final void setOnViewTreeOwnersAvailable(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        C106836fh viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            r2.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.A0J = r2;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (r6.getSource() != r12.getSource()) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007a, code lost:
        if (r6.getToolType(0) == r12.getToolType(0)) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (r6.getButtonState() != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        r1 = r6.getActionMasked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r1 == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        if (r1 == 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (r1 == 6) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r6.getActionMasked() == 10) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r5 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r1 = r7.A0z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r1.A00 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r1.A02.A00.clear();
        r0 = r1.A01.A00;
        r0.A00();
        r0.A00.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        A04(r6, r7, 10, r6.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r12.getToolType(0) == 3) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r5 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r11 == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r3 == 3) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r3 == 9) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (A0A(r12) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        A04(r12, r7, 9, r12.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        if (r6 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r7.A03 = android.view.MotionEvent.obtainNoHistory(r12);
        r4 = A01(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.C13790oJ.A00(-1029101029);
        r3 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        if ((r3 instanceof X.AnonymousClass7XM) == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r1 = getContext();
        r0 = ((X.AnonymousClass7XM) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fe, code lost:
        r1 = android.view.PointerIcon.getSystemIcon(r1, r0);
        X.C04220Ms.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (X.C04220Ms.A0I(getPointerIcon(), r1) != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        setPointerIcon(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        r1 = getContext();
        r0 = 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011a, code lost:
        r7.A0K = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0063, code lost:
        if (r6.getToolType(0) != 3) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (r6 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r7 = r18
            X.7yo r0 = r7.A0b
            r7.removeCallbacks(r0)
            r2 = 0
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x0125 }
            r7.A00 = r0     // Catch:{ all -> 0x0125 }
            X.8fz r0 = r7.A0d     // Catch:{ all -> 0x0125 }
            float[] r3 = r7.A0m     // Catch:{ all -> 0x0125 }
            r0.ABb(r7, r3)     // Catch:{ all -> 0x0125 }
            float[] r0 = r7.A0n     // Catch:{ all -> 0x0125 }
            X.C115926w8.A01(r3, r0)     // Catch:{ all -> 0x0125 }
            r12 = r19
            float r1 = r12.getX()     // Catch:{ all -> 0x0125 }
            float r0 = r12.getY()     // Catch:{ all -> 0x0125 }
            long r0 = X.C86104wH.A0C(r1, r0)     // Catch:{ all -> 0x0125 }
            long r4 = X.AnonymousClass7Hf.A00(r3, r0)     // Catch:{ all -> 0x0125 }
            float r3 = r12.getRawX()     // Catch:{ all -> 0x0125 }
            float r0 = X.AnonymousClass7KC.A01(r4)     // Catch:{ all -> 0x0125 }
            float r3 = r3 - r0
            float r1 = r12.getRawY()     // Catch:{ all -> 0x0125 }
            float r0 = X.AnonymousClass7KC.A02(r4)     // Catch:{ all -> 0x0125 }
            float r1 = r1 - r0
            long r0 = X.C86104wH.A0C(r3, r1)     // Catch:{ all -> 0x0125 }
            r7.A02 = r0     // Catch:{ all -> 0x0125 }
            r11 = 1
            r7.A0K = r11     // Catch:{ all -> 0x0125 }
            r7.Bg5(r2)     // Catch:{ all -> 0x0125 }
            r0 = 0
            r7.A04 = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "AndroidOwner:onTouch"
            r0 = -1881957031(0xffffffff8fd39d59, float:-2.0866814E-29)
            X.C13790oJ.A01(r1, r0)     // Catch:{ all -> 0x0125 }
            int r3 = r12.getActionMasked()     // Catch:{ all -> 0x011d }
            android.view.MotionEvent r6 = r7.A03     // Catch:{ all -> 0x011d }
            r4 = 3
            if (r6 == 0) goto L_0x0065
            int r0 = r6.getToolType(r2)     // Catch:{ all -> 0x011d }
            r5 = 1
            if (r0 == r4) goto L_0x0068
        L_0x0065:
            r5 = 0
            if (r6 == 0) goto L_0x00ba
        L_0x0068:
            int r1 = r6.getSource()     // Catch:{ all -> 0x011d }
            int r0 = r12.getSource()     // Catch:{ all -> 0x011d }
            if (r1 != r0) goto L_0x007c
            int r1 = r6.getToolType(r2)     // Catch:{ all -> 0x011d }
            int r0 = r12.getToolType(r2)     // Catch:{ all -> 0x011d }
            if (r1 == r0) goto L_0x00ba
        L_0x007c:
            int r0 = r6.getButtonState()     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0099
            int r1 = r6.getActionMasked()     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0099
            r0 = 2
            if (r1 == r0) goto L_0x0099
            r0 = 6
            if (r1 == r0) goto L_0x0099
            int r0 = r6.getActionMasked()     // Catch:{ all -> 0x011d }
            r8 = 10
            if (r0 == r8) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
            goto L_0x00b3
        L_0x0099:
            X.6qA r1 = r7.A0z     // Catch:{ all -> 0x011d }
            boolean r0 = r1.A00     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x00ba
            X.6bJ r0 = r1.A02     // Catch:{ all -> 0x011d }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x011d }
            r0.clear()     // Catch:{ all -> 0x011d }
            X.6fd r0 = r1.A01     // Catch:{ all -> 0x011d }
            X.6vN r0 = r0.A00     // Catch:{ all -> 0x011d }
            r0.A00()     // Catch:{ all -> 0x011d }
            X.84X r0 = r0.A00     // Catch:{ all -> 0x011d }
            r0.A05()     // Catch:{ all -> 0x011d }
            goto L_0x00ba
        L_0x00b3:
            long r9 = r6.getEventTime()     // Catch:{ all -> 0x011d }
            A04(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x011d }
        L_0x00ba:
            int r0 = r12.getToolType(r2)     // Catch:{ all -> 0x011d }
            if (r0 == r4) goto L_0x00c1
            r11 = 0
        L_0x00c1:
            if (r5 != 0) goto L_0x00db
            if (r11 == 0) goto L_0x00db
            if (r3 == r4) goto L_0x00db
            r14 = 9
            if (r3 == r14) goto L_0x00db
            boolean r0 = r7.A0A(r12)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00db
            long r15 = r12.getEventTime()     // Catch:{ all -> 0x011d }
            r17 = 1
            r13 = r7
            A04(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x011d }
        L_0x00db:
            if (r6 == 0) goto L_0x00e0
            r6.recycle()     // Catch:{ all -> 0x011d }
        L_0x00e0:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r12)     // Catch:{ all -> 0x011d }
            r7.A03 = r0     // Catch:{ all -> 0x011d }
            int r4 = A01(r12, r7)     // Catch:{ all -> 0x011d }
            r0 = -1029101029(0xffffffffc2a92a1b, float:-84.58224)
            X.C13790oJ.A00(r0)     // Catch:{ all -> 0x0125 }
            X.8mm r3 = r7.A04     // Catch:{ all -> 0x0125 }
            boolean r0 = r3 instanceof X.AnonymousClass7XM     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0113
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x0125 }
            X.7XM r3 = (X.AnonymousClass7XM) r3     // Catch:{ all -> 0x0125 }
            int r0 = r3.A00     // Catch:{ all -> 0x0125 }
        L_0x00fe:
            android.view.PointerIcon r1 = android.view.PointerIcon.getSystemIcon(r1, r0)     // Catch:{ all -> 0x0125 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0125 }
            android.view.PointerIcon r0 = r7.getPointerIcon()     // Catch:{ all -> 0x0125 }
            boolean r0 = X.C04220Ms.A0I(r0, r1)     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x011a
            r7.setPointerIcon(r1)     // Catch:{ all -> 0x0125 }
            goto L_0x011a
        L_0x0113:
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x0125 }
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00fe
        L_0x011a:
            r7.A0K = r2
            return r4
        L_0x011d:
            r1 = move-exception
            r0 = 1318469015(0x4e963d97, float:1.26030938E9)
            X.C13790oJ.A00(r0)     // Catch:{ all -> 0x0125 }
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            r7.A0K = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    public static final int A01(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        Object obj;
        if (androidComposeView.A0M) {
            androidComposeView.A0M = false;
            C123697Yd.A01.CrC(new C114216ss(motionEvent.getMetaState()));
        }
        C112896qN r3 = androidComposeView.A0y;
        C106806fe A002 = r3.A00(motionEvent, androidComposeView);
        if (A002 != null) {
            ListIterator A102 = C86144wL.A10(A002.A01);
            while (true) {
                if (!A102.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = A102.previous();
                if (((C115386uy) obj).A08) {
                    break;
                }
            }
            C115386uy r1 = (C115386uy) obj;
            if (r1 != null) {
                androidComposeView.A0E = r1.A03;
            }
            int A003 = androidComposeView.A0z.A00(A002, androidComposeView, androidComposeView.A0A(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (A003 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                r3.A03.delete(pointerId);
                r3.A04.delete(pointerId);
            }
            return A003;
        }
        C112776qA r12 = androidComposeView.A0z;
        if (r12.A00) {
            return 0;
        }
        r12.A02.A00.clear();
        C115536vN r0 = r12.A01.A00;
        r0.A00();
        r0.A00.A05();
        return 0;
    }

    private final View A02(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (C04220Ms.A0I(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    C04220Ms.A06(childAt);
                    View A022 = A02(childAt, i);
                    if (A022 != null) {
                        return A022;
                    }
                }
            }
        }
        return null;
    }

    private final void A07(AnonymousClass7Y3 r5) {
        int i = 0;
        this.A0X.A06(r5, false);
        AnonymousClass84X A082 = r5.A08();
        int i2 = A082.A00;
        if (i2 > 0) {
            Object[] objArr = A082.A01;
            do {
                A07((AnonymousClass7Y3) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public static final void A08(AndroidComposeView androidComposeView) {
        if (!androidComposeView.A0K) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != androidComposeView.A00) {
                androidComposeView.A00 = currentAnimationTimeMillis;
                C143028fz r0 = androidComposeView.A0d;
                float[] fArr = androidComposeView.A0m;
                r0.ABb(androidComposeView, fArr);
                C115926w8.A01(fArr, androidComposeView.A0n);
                ViewParent parent = androidComposeView.getParent();
                View view = androidComposeView;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = androidComposeView.A15;
                view.getLocationOnScreen(iArr);
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                view.getLocationInWindow(iArr);
                androidComposeView.A02 = C86104wH.A0C(f - ((float) iArr[0]), f2 - ((float) iArr[1]));
            }
        }
    }

    public static final void A09(AndroidComposeView androidComposeView) {
        int[] iArr = androidComposeView.A15;
        androidComposeView.getLocationOnScreen(iArr);
        long j = androidComposeView.A0D;
        int A072 = C86104wH.A07(j);
        int A082 = C86104wH.A08(j);
        boolean z = false;
        int i = iArr[0];
        if (!(A072 == i && A082 == iArr[1])) {
            androidComposeView.A0D = AnonymousClass7Hh.A00(i, iArr[1]);
            if (!(A072 == Integer.MAX_VALUE || A082 == Integer.MAX_VALUE)) {
                androidComposeView.A0V.A0Y.A08.A0F();
                z = true;
            }
        }
        androidComposeView.A0X.A04(z);
    }

    private void setFontFamilyResolver(C143078g4 r2) {
        this.A0r.CrC(r2);
    }

    private void setLayoutDirection(AnonymousClass69J r2) {
        this.A0s.CrC(r2);
    }

    private final void setViewTreeOwners(C106836fh r2) {
        this.A0t.CrC(r2);
    }

    public final void A0D(C146648mb r5) {
        C106856fj r3 = this.A0g;
        while (true) {
            ReferenceQueue referenceQueue = r3.A01;
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                r3.A00.A0E(poll);
            } else {
                r3.A00.A0C(new WeakReference(r5, referenceQueue));
                return;
            }
        }
    }

    public final void A0E(C146648mb r2, boolean z) {
        List list;
        boolean z2 = this.A0L;
        if (z) {
            if (!z2) {
                list = this.A13;
            } else {
                list = this.A0H;
                if (list == null) {
                    list = AnonymousClass0wJ.A0v();
                    this.A0H = list;
                }
            }
            list.add(r2);
        } else if (!z2) {
            this.A13.remove(r2);
            List list2 = this.A0H;
            if (list2 != null) {
                list2.remove(r2);
            }
        }
    }

    public final void Bg5(boolean z) {
        C13790oJ.A01("AndroidOwner:measureAndLayout", 767398991);
        AnonymousClass0ZU r0 = null;
        if (z) {
            try {
                r0 = this.A14;
            } catch (Throwable th) {
                C13790oJ.A00(1535746549);
                throw th;
            }
        }
        AnonymousClass7HO r1 = this.A0X;
        if (r1.A07(r0)) {
            requestLayout();
        }
        r1.A04(false);
        C13790oJ.A00(-969295948);
    }

    public final void BwF() {
        if (this.A09) {
            AnonymousClass78y r0 = this.A0Y.A00;
            C138738Lg r18 = C138738Lg.A00;
            AnonymousClass84X r6 = r0.A04;
            synchronized (r6) {
                int i = r6.A00;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = r6.A01;
                    do {
                        C111226mz r2 = (C111226mz) objArr[i2];
                        AnonymousClass7EA r9 = r2.A04;
                        int i3 = r9.A00;
                        int i4 = 0;
                        for (int i5 = 0; i5 < i3; i5++) {
                            Object obj = r9.A01[i5];
                            C04220Ms.A0C(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            C112306pM r13 = (C112306pM) r9.A02[i5];
                            boolean A1X = AnonymousClass0wJ.A1X(r18.invoke(obj));
                            if (A1X) {
                                int i6 = r13.A00;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    Object obj2 = r13.A02[i7];
                                    C04220Ms.A0C(obj2, I17.A00(19));
                                    C121227Ew r15 = r2.A07;
                                    r15.A05(obj2, obj);
                                    if (obj2 instanceof C147358pD) {
                                        C04220Ms.A0B(obj2, 0);
                                        if (!C86114wI.A1S(C121227Ew.A00(r15, obj2))) {
                                            r2.A06.A03(obj2);
                                            r2.A08.remove(obj2);
                                        }
                                    }
                                }
                            }
                            if (!A1X) {
                                if (i4 != i5) {
                                    r9.A01[i4] = obj;
                                    Object[] objArr2 = r9.A02;
                                    objArr2[i4] = objArr2[i5];
                                }
                                i4++;
                            }
                        }
                        int i8 = r9.A00;
                        if (i8 > i4) {
                            for (int i9 = i4; i9 < i8; i9++) {
                                r9.A01[i9] = null;
                                r9.A02[i9] = null;
                            }
                            r9.A00 = i4;
                        }
                        i2++;
                    } while (i2 < i);
                }
            }
            this.A09 = false;
        }
        AnonymousClass50l r02 = this.A0F;
        if (r02 != null) {
            A05(r02);
        }
        while (true) {
            AnonymousClass84X r5 = this.A0u;
            int i10 = r5.A00;
            if (i10 != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr3 = r5.A01;
                    AnonymousClass0ZU r1 = (AnonymousClass0ZU) objArr3[i11];
                    objArr3[i11] = null;
                    if (r1 != null) {
                        r1.invoke();
                    }
                }
                r5.A07(0, i10);
            } else {
                return;
            }
        }
    }

    public final void C4J(AnonymousClass7Y3 r3) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0c;
        androidComposeViewAccessibilityDelegateCompat.A0E = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0S() && androidComposeViewAccessibilityDelegateCompat.A0L.add(r3)) {
            androidComposeViewAccessibilityDelegateCompat.A0Q.D7w(Unit.A00);
        }
    }

    public final void CJp() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0c;
        androidComposeViewAccessibilityDelegateCompat.A0E = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0S() && !androidComposeViewAccessibilityDelegateCompat.A0D) {
            androidComposeViewAccessibilityDelegateCompat.A0D = true;
            androidComposeViewAccessibilityDelegateCompat.A0H.post(androidComposeViewAccessibilityDelegateCompat.A0N);
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.A0c.A0T(i, this.A0E, false);
    }

    public final boolean canScrollVertically(int i) {
        return this.A0c.A0T(i, this.A0E, true);
    }

    public AnonymousClass7YP getAccessibilityManager() {
        return this.A0Z;
    }

    public final AnonymousClass50l getAndroidViewsHandler$ui_release() {
        if (this.A0F == null) {
            Context context = getContext();
            C04220Ms.A06(context);
            AnonymousClass50l r0 = new AnonymousClass50l(context);
            this.A0F = r0;
            addView(r0);
        }
        AnonymousClass50l r02 = this.A0F;
        C04220Ms.A0A(r02);
        return r02;
    }

    public C141768cv getAutofill() {
        return this.A0O;
    }

    public C104106bF getAutofillTree() {
        return this.A0P;
    }

    public AnonymousClass7YS getClipboardManager() {
        return this.A0a;
    }

    public final AnonymousClass0YY getConfigurationChangeObserver() {
        return this.A0I;
    }

    public C147168nV getDensity() {
        return this.A06;
    }

    public C147548pW getFocusOwner() {
        return this.A0Q;
    }

    public C143078g4 getFontFamilyResolver() {
        return (C143078g4) this.A0r.getValue();
    }

    public AnonymousClass8d7 getFontLoader() {
        return this.A0j;
    }

    public C142938fq getHapticFeedBack() {
        return this.A0R;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return C18250wR.A1K(this.A0X.A03.A00);
    }

    public C141778cw getInputModeManager() {
        return this.A0S;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A00;
    }

    public AnonymousClass69J getLayoutDirection() {
        return (AnonymousClass69J) this.A0s.getValue();
    }

    public long getMeasureIteration() {
        if (this.A0X.A01) {
            return 1;
        }
        throw C18190wL.A0a("measureIteration should be only used during the measure/layout pass");
    }

    public C1197076n getModifierLocalManager() {
        return this.A0U;
    }

    public AnonymousClass7Z4 getPlatformTextInputPluginRegistry() {
        return this.A0k;
    }

    public C141788cx getPointerIconService() {
        return this.A0T;
    }

    public AnonymousClass7Y3 getRoot() {
        return this.A0V;
    }

    public C141818d1 getRootForTest() {
        return this.A10;
    }

    public C111666o7 getSemanticsOwner() {
        return this.A0i;
    }

    public AnonymousClass7XB getSharedDrawScope() {
        return this.A0W;
    }

    public boolean getShowLayoutBounds() {
        return this.A0A;
    }

    public C112956qT getSnapshotObserver() {
        return this.A0Y;
    }

    public AnonymousClass8dG getTextInputForTests() {
        AnonymousClass7Z4 r0 = this.A0k;
        if (r0.A01.get(r0.A00) == null) {
            return null;
        }
        throw C18180wK.A0a("Text input service wrapper not set up! Did you use ComposeTestRule?");
    }

    public C106886fn getTextInputService() {
        return this.A0l;
    }

    public C143048g1 getTextToolbar() {
        return this.A0e;
    }

    public View getView() {
        return this;
    }

    public C146118lf getViewConfiguration() {
        return this.A0f;
    }

    public final C106836fh getViewTreeOwners() {
        return (C106836fh) this.A0t.getValue();
    }

    public AnonymousClass8d6 getWindowInfo() {
        return this.A0h;
    }

    public final boolean onCheckIsTextEditor() {
        AnonymousClass7Z4 r0 = this.A0k;
        return AnonymousClass0wJ.A1W(r0.A01.get(r0.A00));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0X.A07(this.A14);
        this.A0G = null;
        A09(this);
        if (this.A0F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void onMeasure(int i, int i2) {
        AnonymousClass7HO r6;
        IllegalArgumentException th;
        C13790oJ.A01("AndroidOwner:onMeasure", 1325845068);
        try {
            if (!isAttachedToWindow()) {
                A07(this.A0V);
            }
            Pair A032 = A03(i);
            int A042 = AnonymousClass0wJ.A04(A032.A00);
            int A043 = AnonymousClass0wJ.A04(A032.A01);
            Pair A033 = A03(i2);
            long A022 = AnonymousClass7JT.A02(A042, A043, AnonymousClass0wJ.A04(A033.A00), AnonymousClass0wJ.A04(A033.A01));
            Constraints constraints = this.A0G;
            if (constraints == null) {
                this.A0G = new Constraints(A022);
                this.A0B = false;
            } else if (constraints.A00 != A022) {
                this.A0B = true;
            }
            r6 = this.A0X;
            Constraints constraints2 = r6.A00;
            if (constraints2 == null || constraints2.A00 != A022) {
                if (!r6.A01) {
                    r6.A00 = new Constraints(A022);
                    AnonymousClass7Y3 r2 = r6.A04;
                    r2.A0Y.A06 = true;
                    r6.A03.A00(r2);
                } else {
                    th = C18190wL.A0a("Failed requirement.");
                    throw th;
                }
            }
            AnonymousClass7Y3 r3 = r6.A04;
            if (!AnonymousClass0wJ.A1W(r3.A0A)) {
                th = C18190wL.A0a("Failed requirement.");
            } else if (!r3.A0N) {
                th = C18190wL.A0a("Failed requirement.");
            } else if (!r6.A01) {
                if (r6.A00 != null) {
                    r6.A01 = true;
                    AnonymousClass7HO.A00(r3, r6);
                    r6.A01 = false;
                }
                AnonymousClass54J r4 = this.A0V.A0Y.A08;
                setMeasuredDimension(r4.A01, r4.A00);
                if (this.A0F != null) {
                    getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(r4.A01, 1073741824), View.MeasureSpec.makeMeasureSpec(r4.A00, 1073741824));
                }
                C13790oJ.A00(134025815);
                return;
            } else {
                th = C18190wL.A0a("Failed requirement.");
            }
        } catch (Throwable th2) {
            C13790oJ.A00(-1463227767);
            throw th2;
        }
        throw th;
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C123367Wq r6;
        if (viewStructure != null && (r6 = this.A0O) != null) {
            Map map = r6.A02.A00;
            int addChildCount = viewStructure.addChildCount(map.size());
            Iterator A0z2 = AnonymousClass0wJ.A0z(map);
            while (A0z2.hasNext()) {
                Map.Entry A0o2 = C18180wK.A0o(A0z2);
                int A042 = AnonymousClass0wJ.A04(A0o2.getKey());
                A0o2.getValue();
                ViewStructure newChild = viewStructure.newChild(addChildCount);
                if (newChild != null) {
                    AutofillId autofillId = viewStructure.getAutofillId();
                    C04220Ms.A0A(autofillId);
                    C04220Ms.A0B(autofillId, 1);
                    newChild.setAutofillId(autofillId, A042);
                    newChild.setId(A042, r6.A00.getContext().getPackageName(), (String) null, (String) null);
                    newChild.setAutofillType(1);
                    throw C18210wN.A0W("getAutofillTypes");
                }
                addChildCount++;
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        AnonymousClass69J r2;
        if (this.A0N) {
            if (i == 0 || i != 1) {
                r2 = AnonymousClass69J.Ltr;
            } else {
                r2 = AnonymousClass69J.Rtl;
            }
            setLayoutDirection(r2);
            C04220Ms.A0B(r2, 0);
            ((C123407Wu) this.A0Q).A01 = r2;
        }
    }

    public static final Pair A03(int i) {
        int i2;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i2 = 0;
            i3 = Integer.valueOf(size);
        } else if (mode == 0) {
            i2 = 0;
            i3 = Integer.MAX_VALUE;
        } else if (mode == 1073741824) {
            Integer valueOf = Integer.valueOf(size);
            return new Pair(valueOf, valueOf);
        } else {
            throw new IllegalStateException();
        }
        return C18180wK.A0p(i2, i3);
    }

    private final void A05(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).BwF();
            } else if (childAt instanceof ViewGroup) {
                A05((ViewGroup) childAt);
            }
        }
    }

    private final void A06(AnonymousClass7Y3 r5) {
        r5.A0E();
        AnonymousClass84X A082 = r5.A08();
        int i = A082.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A082.A01;
            do {
                A06((AnonymousClass7Y3) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    private final boolean A0A(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > x || x > ((float) getWidth()) || BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > y || y > ((float) getHeight())) {
            return false;
        }
        return true;
    }

    private final boolean A0B(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A03) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
            return true;
        }
        return false;
    }

    public final long Bb1(long j) {
        A08(this);
        long A002 = AnonymousClass7Hf.A00(this.A0m, j);
        float A012 = AnonymousClass7KC.A01(A002);
        long j2 = this.A02;
        return C86104wH.A0C(A012 + AnonymousClass7KC.A01(j2), AnonymousClass7KC.A02(A002) + AnonymousClass7KC.A02(j2));
    }

    public final void CHK(AnonymousClass066 r2) {
        this.A0A = AnonymousClass6F4.A00();
    }

    public final void onAttachedToWindow() {
        IllegalStateException A0a2;
        int i;
        AnonymousClass066 r0;
        int A062 = C14030oh.A06(-1959921902);
        super.onAttachedToWindow();
        AnonymousClass7Y3 r02 = this.A0V;
        A07(r02);
        A06(r02);
        AnonymousClass78y r1 = this.A0Y.A00;
        r1.A00 = C121637Hc.A01(r1.A08);
        C123367Wq r03 = this.A0O;
        if (r03 != null) {
            r03.A01.registerCallback(AnonymousClass50y.A00);
        }
        AnonymousClass066 A002 = C116066wM.A00(this);
        C15750rp r3 = (C15750rp) C146838mw.A00(C138988Mf.A00, AnonymousClass8bL.A08(this, C138978Me.A00));
        C106836fh viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            if (!(A002 == null || r3 == null || (A002 == (r0 = viewTreeOwners.A00) && r3 == r0))) {
                AnonymousClass062 lifecycle = r0.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.A08(this);
                }
            }
            this.A0S.A00.CrC(new C114186sp(C86164wN.A04(isInTouchMode() ? 1 : 0)));
            C106836fh viewTreeOwners2 = getViewTreeOwners();
            C04220Ms.A0A(viewTreeOwners2);
            viewTreeOwners2.A00.getLifecycle().A07(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this.A0o);
            getViewTreeObserver().addOnScrollChangedListener(this.A0p);
            getViewTreeObserver().addOnTouchModeChangeListener(this.A0q);
            C14030oh.A0D(-935181511, A062);
        }
        if (A002 == null) {
            A0a2 = C18180wK.A0a("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            i = 300320207;
        } else if (r3 == null) {
            A0a2 = C18180wK.A0a("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            i = -1768683960;
        }
        C14030oh.A0D(i, A062);
        throw A0a2;
        A002.getLifecycle().A07(this);
        C106836fh r12 = new C106836fh(A002, r3);
        setViewTreeOwners(r12);
        AnonymousClass0YY r04 = this.A0J;
        if (r04 != null) {
            r04.invoke(r12);
        }
        this.A0J = null;
        this.A0S.A00.CrC(new C114186sp(C86164wN.A04(isInTouchMode() ? 1 : 0)));
        C106836fh viewTreeOwners22 = getViewTreeOwners();
        C04220Ms.A0A(viewTreeOwners22);
        viewTreeOwners22.A00.getLifecycle().A07(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A0o);
        getViewTreeObserver().addOnScrollChangedListener(this.A0p);
        getViewTreeObserver().addOnTouchModeChangeListener(this.A0q);
        C14030oh.A0D(-935181511, A062);
    }

    public final void onDetachedFromWindow() {
        AnonymousClass062 lifecycle;
        int A062 = C14030oh.A06(-1116022190);
        super.onDetachedFromWindow();
        AnonymousClass78y r1 = this.A0Y.A00;
        C142868fj r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A01();
        C106836fh viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (lifecycle = viewTreeOwners.A00.getLifecycle()) == null)) {
            lifecycle.A08(this);
        }
        C123367Wq r02 = this.A0O;
        if (r02 != null) {
            r02.A01.unregisterCallback(AnonymousClass50y.A00);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A0o);
        getViewTreeObserver().removeOnScrollChangedListener(this.A0p);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0q);
        C14030oh.A0D(66836650, A062);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = C14030oh.A06(-860137054);
        super.onFocusChanged(z, i, rect);
        C123407Wu r0 = (C123407Wu) this.A0Q;
        if (z) {
            C875353d r2 = r0.A00;
            if (r2.A00 == AnonymousClass6Av.Inactive) {
                r2.A00 = AnonymousClass6Av.Active;
            }
        } else {
            AnonymousClass7FL.A03(r0.A00, true, true);
        }
        C14030oh.A0D(977271201, A062);
    }

    public final void onWindowFocusChanged(boolean z) {
        boolean A002;
        int A062 = C14030oh.A06(-1134802228);
        C147368pE.A04(this.A0h.A00, z);
        this.A0M = true;
        super.onWindowFocusChanged(z);
        if (z && this.A0A != (A002 = AnonymousClass6F4.A00())) {
            this.A0A = A002;
            A06(this.A0V);
        }
        C14030oh.A0D(-192035441, A062);
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.A00 = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.A0A = z;
    }
}
