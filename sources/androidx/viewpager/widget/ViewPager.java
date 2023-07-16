package androidx.viewpager.widget;

import X.AnonymousClass00U;
import X.AnonymousClass07E;
import X.AnonymousClass07F;
import X.AnonymousClass07G;
import X.AnonymousClass07I;
import X.AnonymousClass07J;
import X.AnonymousClass07K;
import X.AnonymousClass07L;
import X.AnonymousClass07N;
import X.AnonymousClass7Ax;
import X.C006002r;
import X.C006702y;
import X.C14030oh;
import X.C16150sZ;
import X.C16170sb;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import com.facebook.redex.IDxObjectShape112S0000000_I2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] A0l = {16842931};
    public static final Interpolator A0m = new AnonymousClass07F();
    public static final Comparator A0n = new IDxComparatorShape93S0000000_I2(0);
    public float A00 = -3.4028235E38f;
    public float A01 = Float.MAX_VALUE;
    public int A02;
    public int A03;
    public VelocityTracker A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public Scroller A07;
    public AnonymousClass07E A08;
    public AnonymousClass07L A09;
    public List A0A;
    public List A0B;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public int A0K = -1;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T = 1;
    public int A0U = -1;
    public int A0V = 0;
    public int A0W;
    public int A0X;
    public Drawable A0Y;
    public Parcelable A0Z = null;
    public AnonymousClass07N A0a;
    public ClassLoader A0b = null;
    public boolean A0c;
    public boolean A0d = true;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public final ArrayList A0h = new ArrayList();
    public final Rect A0i = new Rect();
    public final AnonymousClass07I A0j = new AnonymousClass07I();
    public final Runnable A0k = new AnonymousClass07G(this);
    public int mGutterSize;

    public @interface DecorView {
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new IDxObjectShape112S0000000_I2(2);
        public int A00;
        public Parcelable A01;
        public ClassLoader A02;

        public final String toString() {
            return AnonymousClass00U.A07(this.A00, "FragmentPager.SavedState{", Integer.toHexString(System.identityHashCode(this)), " position=", "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A01, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.A00 = parcel.readInt();
            this.A01 = parcel.readParcelable(classLoader);
            this.A02 = classLoader;
        }
    }

    private boolean A09() {
        this.A0K = -1;
        this.A0D = false;
        this.A0F = false;
        VelocityTracker velocityTracker = this.A04;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A04 = null;
        }
        this.A05.onRelease();
        this.A06.onRelease();
        if (!this.A05.isFinished() || !this.A06.isFinished()) {
            return true;
        }
        return false;
    }

    public final AnonymousClass07I A0C(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i2 >= arrayList.size()) {
                return null;
            }
            AnonymousClass07I r1 = (AnonymousClass07I) arrayList.get(i2);
            if (r1.A04 == i) {
                return r1;
            }
            i2++;
        }
    }

    public final AnonymousClass07I A0E(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i >= arrayList.size()) {
                return null;
            }
            AnonymousClass07I r2 = (AnonymousClass07I) arrayList.get(i);
            if (this.A08.isViewFromObject(view, r2.A00)) {
                return r2;
            }
            i++;
        }
    }

    public void A0J(int i, boolean z) {
        this.A0f = false;
        A0I(i, 0, z, false);
    }

    public final void A0K(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setFocusable(true);
        this.A07 = new Scroller(context, A0m);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0X = viewConfiguration.getScaledPagingTouchSlop();
        this.A0S = (int) (400.0f * f);
        this.A0R = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A05 = new EdgeEffect(context);
        this.A06 = new EdgeEffect(context);
        this.A0Q = (int) (25.0f * f);
        this.A0M = (int) (2.0f * f);
        this.A0O = (int) (f * 16.0f);
        C006702y.A0C(this, new C16170sb(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C006002r.A00(this, new C16150sZ(this));
    }

    public final void addTouchables(ArrayList arrayList) {
        AnonymousClass07I A0E2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0E2 = A0E(childAt)) != null && A0E2.A04 == this.A02) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void computeScroll() {
        this.A0E = true;
        if (this.A07.isFinished() || !this.A07.computeScrollOffset()) {
            A08(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.A07.getCurrX();
        int currY = this.A07.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A0B(currX)) {
                this.A07.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r10 == 80) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r11 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r2 = 0
            r0 = r18
            int r1 = getDefaultSize(r2, r0)
            r0 = r19
            int r0 = getDefaultSize(r2, r0)
            r8 = r17
            r8.setMeasuredDimension(r1, r0)
            int r7 = r8.getMeasuredWidth()
            int r1 = r7 / 10
            int r0 = r8.A0O
            int r0 = java.lang.Math.min(r1, r0)
            r8.mGutterSize = r0
            int r0 = r8.getPaddingLeft()
            int r7 = r7 - r0
            int r0 = r8.getPaddingRight()
            int r7 = r7 - r0
            int r5 = r8.getMeasuredHeight()
            int r0 = r8.getPaddingTop()
            int r5 = r5 - r0
            int r0 = r8.getPaddingBottom()
            int r5 = r5 - r0
            int r4 = r8.getChildCount()
            r3 = 0
        L_0x003d:
            r10 = 8
            r11 = 1
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 >= r4) goto L_0x00be
            android.view.View r6 = r8.getChildAt(r3)
            int r0 = r6.getVisibility()
            if (r0 == r10) goto L_0x00a5
            android.view.ViewGroup$LayoutParams r13 = r6.getLayoutParams()
            X.07J r13 = (X.AnonymousClass07J) r13
            if (r13 == 0) goto L_0x00a5
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x00a5
            int r0 = r13.A02
            r1 = r0 & 7
            r10 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r10 == r0) goto L_0x006a
            r0 = 80
            r16 = 0
            if (r10 != r0) goto L_0x006c
        L_0x006a:
            r16 = 1
        L_0x006c:
            r0 = 3
            if (r1 == r0) goto L_0x0073
            r0 = 5
            if (r1 == r0) goto L_0x0073
            r11 = 0
        L_0x0073:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r16 == 0) goto L_0x00b9
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0079:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007b:
            int r0 = r13.width
            r10 = -1
            r14 = -2
            if (r0 == r14) goto L_0x00b7
            int r0 = r13.width
            if (r0 == r10) goto L_0x00b5
            int r1 = r13.width
        L_0x0087:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0089:
            int r0 = r13.height
            if (r0 == r14) goto L_0x00b2
            int r0 = r13.height
            if (r0 == r10) goto L_0x00b0
            int r0 = r13.height
        L_0x0093:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            r6.measure(r1, r0)
            if (r16 == 0) goto L_0x00a8
            int r0 = r6.getMeasuredHeight()
            int r5 = r5 - r0
        L_0x00a5:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x00a8:
            if (r11 == 0) goto L_0x00a5
            int r0 = r6.getMeasuredWidth()
            int r7 = r7 - r0
            goto L_0x00a5
        L_0x00b0:
            r0 = r5
            goto L_0x0093
        L_0x00b2:
            r0 = r5
            r9 = r15
            goto L_0x0093
        L_0x00b5:
            r1 = r7
            goto L_0x0087
        L_0x00b7:
            r1 = r7
            goto L_0x0089
        L_0x00b9:
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != 0) goto L_0x007b
            goto L_0x0079
        L_0x00be:
            android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r8.A0e = r11
            int r0 = r8.A02
            r8.A0G(r0)
            r5 = 0
            r8.A0e = r2
            int r4 = r8.getChildCount()
        L_0x00d3:
            if (r5 >= r4) goto L_0x00fa
            android.view.View r3 = r8.getChildAt(r5)
            int r0 = r3.getVisibility()
            if (r0 == r10) goto L_0x00f7
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.07J r2 = (X.AnonymousClass07J) r2
            if (r2 == 0) goto L_0x00eb
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x00f7
        L_0x00eb:
            float r1 = (float) r7
            float r0 = r2.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            r3.measure(r0, r6)
        L_0x00f7:
            int r5 = r5 + 1
            goto L_0x00d3
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public void setCurrentItem(int i) {
        this.A0f = false;
        A0I(i, 0, !this.A0d, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", AnonymousClass00U.A01(i, 1, "Requested offscreen page limit ", " too small; defaulting to "));
            i = 1;
        }
        if (i != this.A0T) {
            this.A0T = i;
            A0G(this.A02);
        }
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = (ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
        }
        return rect;
    }

    private void A04(int i) {
        AnonymousClass07L r0 = this.A09;
        if (r0 != null) {
            r0.onPageSelected(i);
        }
        List list = this.A0B;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass07L r02 = (AnonymousClass07L) this.A0B.get(i2);
                if (r02 != null) {
                    r02.onPageSelected(i);
                }
            }
        }
    }

    private void A05(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        if (i2 <= 0 || this.A0h.isEmpty()) {
            AnonymousClass07I A0C2 = A0C(this.A02);
            if (A0C2 != null) {
                f = Math.min(A0C2.A02, this.A01);
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            i5 = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i5 != getScrollX()) {
                A08(false);
            } else {
                return;
            }
        } else if (!this.A07.isFinished()) {
            this.A07.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            i5 = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(i5, getScrollY());
    }

    private void A08(boolean z) {
        boolean z2 = false;
        if (this.A0V == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.A07.isFinished()) {
                this.A07.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A07.getCurrX();
                int currY = this.A07.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0B(currX);
                    }
                }
            }
        }
        this.A0f = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i >= arrayList.size()) {
                break;
            }
            AnonymousClass07I r1 = (AnonymousClass07I) arrayList.get(i);
            if (r1.A01) {
                r1.A01 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.A0k;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean A0A(float f, float f2) {
        boolean z;
        float f3 = this.A0I - f;
        this.A0I = f;
        float A002 = A00(f3, f2);
        float f4 = f3 - A002;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        if (A002 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z4 = true;
        }
        if (Math.abs(f4) >= 1.0E-4f) {
            float scrollX = ((float) getScrollX()) + f4;
            float clientWidth = (float) getClientWidth();
            float f5 = this.A00 * clientWidth;
            float f6 = this.A01 * clientWidth;
            ArrayList arrayList = this.A0h;
            AnonymousClass07I r1 = (AnonymousClass07I) arrayList.get(0);
            AnonymousClass07I r7 = (AnonymousClass07I) arrayList.get(arrayList.size() - 1);
            if (r1.A04 != 0) {
                f5 = r1.A02 * clientWidth;
                z = false;
            } else {
                z = true;
            }
            if (r7.A04 != this.A08.getCount() - 1) {
                f6 = r7.A02 * clientWidth;
            } else {
                z2 = true;
            }
            if (scrollX < f5) {
                if (z) {
                    AnonymousClass7Ax.A01(this.A05, (f5 - scrollX) / clientWidth, 1.0f - (f2 / ((float) getHeight())));
                } else {
                    z3 = z4;
                }
                z4 = z3;
                scrollX = f5;
            } else if (scrollX > f6) {
                if (z2) {
                    AnonymousClass7Ax.A01(this.A06, (scrollX - f6) / clientWidth, f2 / ((float) getHeight()));
                } else {
                    z3 = z4;
                }
                z4 = z3;
                scrollX = f6;
            }
            int i = (int) scrollX;
            this.A0I += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            A0B(i);
        }
        return z4;
    }

    private boolean A0B(int i) {
        if (this.A0h.size() == 0) {
            if (!this.A0d) {
                this.A0c = false;
                A0H(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0);
                if (!this.A0c) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        AnonymousClass07I A032 = A03();
        int clientWidth = getClientWidth();
        int i2 = this.A03;
        int i3 = clientWidth + i2;
        float f = (float) i2;
        float f2 = (float) clientWidth;
        int i4 = A032.A04;
        float f3 = ((((float) i) / f2) - A032.A02) / (A032.A03 + (f / f2));
        this.A0c = false;
        A0H(i4, f3, (int) (((float) i3) * f3));
        if (this.A0c) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
        }
    }

    public final AnonymousClass07I A0D(int i, int i2) {
        AnonymousClass07I r2 = new AnonymousClass07I();
        r2.A04 = i;
        r2.A00 = this.A08.instantiateItem((ViewGroup) this, i);
        r2.A03 = this.A08.getPageWidth(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0h;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, r2);
                return r2;
            }
        }
        this.A0h.add(r2);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.size() >= r7) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r11 = this;
            X.07E r0 = r11.A08
            int r7 = r0.getCount()
            r11.A0P = r7
            java.util.ArrayList r3 = r11.A0h
            int r1 = r3.size()
            int r0 = r11.A0T
            int r0 = r0 << 1
            int r0 = r0 + 1
            r5 = 0
            if (r1 >= r0) goto L_0x001e
            int r0 = r3.size()
            r10 = 1
            if (r0 < r7) goto L_0x001f
        L_0x001e:
            r10 = 0
        L_0x001f:
            int r4 = r11.A02
            r6 = 0
            r9 = 0
        L_0x0023:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0075
            java.lang.Object r8 = r3.get(r6)
            X.07I r8 = (X.AnonymousClass07I) r8
            X.07E r1 = r11.A08
            java.lang.Object r0 = r8.A00
            int r2 = r1.getItemPosition(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0064
            r0 = -2
            if (r2 != r0) goto L_0x0067
            r3.remove(r6)
            int r6 = r6 + -1
            if (r9 != 0) goto L_0x004a
            X.07E r0 = r11.A08
            r0.startUpdate((android.view.ViewGroup) r11)
            r9 = 1
        L_0x004a:
            X.07E r2 = r11.A08
            int r1 = r8.A04
            java.lang.Object r0 = r8.A00
            r2.destroyItem((android.view.ViewGroup) r11, (int) r1, (java.lang.Object) r0)
            int r1 = r11.A02
            int r0 = r8.A04
            if (r1 != r0) goto L_0x0063
            int r0 = r7 + -1
            int r0 = java.lang.Math.min(r1, r0)
            int r4 = java.lang.Math.max(r5, r0)
        L_0x0063:
            r10 = 1
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0067:
            int r0 = r8.A04
            if (r0 == r2) goto L_0x0064
            int r1 = r8.A04
            int r0 = r11.A02
            if (r1 != r0) goto L_0x0072
            r4 = r2
        L_0x0072:
            r8.A04 = r2
            goto L_0x0063
        L_0x0075:
            if (r9 == 0) goto L_0x007c
            X.07E r0 = r11.A08
            r0.finishUpdate((android.view.ViewGroup) r11)
        L_0x007c:
            java.util.Comparator r0 = A0n
            java.util.Collections.sort(r3, r0)
            if (r10 == 0) goto L_0x00a5
            int r3 = r11.getChildCount()
            r2 = 0
        L_0x0088:
            if (r2 >= r3) goto L_0x009e
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.07J r1 = (X.AnonymousClass07J) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x009b
            r0 = 0
            r1.A00 = r0
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x009e:
            r0 = 1
            r11.A0I(r4, r5, r5, r0)
            r11.requestLayout()
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0F():void");
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r0 == r1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(int r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A02
            r1 = r19
            if (r0 == r1) goto L_0x00d0
            X.07I r11 = r3.A0C(r0)
            r3.A02 = r1
        L_0x000e:
            X.07E r0 = r3.A08
            if (r0 == 0) goto L_0x0323
            boolean r0 = r3.A0f
            if (r0 != 0) goto L_0x0323
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 == 0) goto L_0x0323
            X.07E r0 = r3.A08
            r0.startUpdate((android.view.ViewGroup) r3)
            int r5 = r3.A0T
            int r1 = r3.A02
            int r1 = r1 - r5
            r0 = 0
            int r13 = java.lang.Math.max(r0, r1)
            X.07E r0 = r3.A08
            int r4 = r0.getCount()
            int r2 = r4 + -1
            int r1 = r3.A02
            int r0 = r1 + r5
            int r12 = java.lang.Math.min(r2, r0)
            int r0 = r3.A0P
            if (r4 != r0) goto L_0x02ce
            r2 = 0
        L_0x0040:
            java.util.ArrayList r10 = r3.A0h
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x00c8
            java.lang.Object r8 = r10.get(r2)
            X.07I r8 = (X.AnonymousClass07I) r8
            int r0 = r8.A04
            if (r0 < r1) goto L_0x00c4
            if (r0 != r1) goto L_0x00c8
        L_0x0054:
            r17 = 0
            if (r8 == 0) goto L_0x0259
            int r9 = r2 + -1
            if (r9 < 0) goto L_0x00c2
            java.lang.Object r6 = r10.get(r9)
            X.07I r6 = (X.AnonymousClass07I) r6
        L_0x0062:
            int r7 = r3.getClientWidth()
            r16 = 1073741824(0x40000000, float:2.0)
            if (r7 > 0) goto L_0x00b5
            r5 = 0
        L_0x006b:
            int r0 = r3.A02
            int r14 = r0 + -1
            r15 = 0
        L_0x0070:
            if (r14 < 0) goto L_0x00d3
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            if (r14 >= r13) goto L_0x009d
            if (r6 == 0) goto L_0x00d3
            int r0 = r6.A04
            if (r14 != r0) goto L_0x0098
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0098
            r10.remove(r9)
            X.07E r1 = r3.A08
            java.lang.Object r0 = r6.A00
            r1.destroyItem((android.view.ViewGroup) r3, (int) r14, (java.lang.Object) r0)
            int r9 = r9 + -1
            int r2 = r2 + -1
        L_0x0090:
            if (r9 < 0) goto L_0x009b
            java.lang.Object r6 = r10.get(r9)
            X.07I r6 = (X.AnonymousClass07I) r6
        L_0x0098:
            int r14 = r14 + -1
            goto L_0x0070
        L_0x009b:
            r6 = 0
            goto L_0x0098
        L_0x009d:
            if (r6 == 0) goto L_0x00a9
            int r0 = r6.A04
            if (r14 != r0) goto L_0x00a9
            float r0 = r6.A03
            float r15 = r15 + r0
            int r9 = r9 + -1
            goto L_0x0090
        L_0x00a9:
            int r0 = r9 + 1
            X.07I r0 = r3.A0D(r14, r0)
            float r0 = r0.A03
            float r15 = r15 + r0
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00b5:
            float r0 = r8.A03
            float r5 = r16 - r0
            int r0 = r3.getPaddingLeft()
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
            float r5 = r5 + r1
            goto L_0x006b
        L_0x00c2:
            r6 = 0
            goto L_0x0062
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00c8:
            r8 = 0
            if (r4 <= 0) goto L_0x0054
            X.07I r8 = r3.A0D(r1, r2)
            goto L_0x0054
        L_0x00d0:
            r11 = 0
            goto L_0x000e
        L_0x00d3:
            float r6 = r8.A03
            int r5 = r2 + 1
            r9 = r5
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x013c
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x013a
            java.lang.Object r13 = r10.get(r5)
            X.07I r13 = (X.AnonymousClass07I) r13
        L_0x00e8:
            if (r7 > 0) goto L_0x0130
            r1 = 0
        L_0x00eb:
            int r7 = r3.A02
        L_0x00ed:
            int r7 = r7 + 1
            if (r7 >= r4) goto L_0x013c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            if (r7 <= r12) goto L_0x011a
            if (r13 == 0) goto L_0x013c
            int r0 = r13.A04
            if (r7 != r0) goto L_0x00ed
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x00ed
            r10.remove(r5)
            X.07E r14 = r3.A08
            java.lang.Object r0 = r13.A00
            r14.destroyItem((android.view.ViewGroup) r3, (int) r7, (java.lang.Object) r0)
        L_0x010b:
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x0118
            java.lang.Object r13 = r10.get(r5)
            X.07I r13 = (X.AnonymousClass07I) r13
            goto L_0x00ed
        L_0x0118:
            r13 = 0
            goto L_0x00ed
        L_0x011a:
            if (r13 == 0) goto L_0x0126
            int r0 = r13.A04
            if (r7 != r0) goto L_0x0126
            float r0 = r13.A03
            float r6 = r6 + r0
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0126:
            X.07I r0 = r3.A0D(r7, r5)
            int r5 = r5 + 1
            float r0 = r0.A03
            float r6 = r6 + r0
            goto L_0x010b
        L_0x0130:
            int r0 = r3.getPaddingRight()
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
            float r1 = r1 + r16
            goto L_0x00eb
        L_0x013a:
            r13 = 0
            goto L_0x00e8
        L_0x013c:
            X.07E r0 = r3.A08
            int r13 = r0.getCount()
            int r1 = r3.getClientWidth()
            if (r1 <= 0) goto L_0x0193
            int r0 = r3.A03
            float r7 = (float) r0
            float r0 = (float) r1
            float r7 = r7 / r0
        L_0x014d:
            if (r11 == 0) goto L_0x01cc
            int r6 = r11.A04
            int r0 = r8.A04
            if (r6 >= r0) goto L_0x0195
            r4 = 0
            float r1 = r11.A02
            float r0 = r11.A03
            float r1 = r1 + r0
            float r1 = r1 + r7
        L_0x015c:
            int r6 = r6 + 1
            int r0 = r8.A04
            if (r6 > r0) goto L_0x01cc
            int r0 = r10.size()
            if (r4 >= r0) goto L_0x01cc
        L_0x0168:
            java.lang.Object r5 = r10.get(r4)
            X.07I r5 = (X.AnonymousClass07I) r5
            int r0 = r5.A04
            if (r6 <= r0) goto L_0x017d
            int r0 = r10.size()
            int r0 = r0 + -1
            if (r4 >= r0) goto L_0x017d
            int r4 = r4 + 1
            goto L_0x0168
        L_0x017d:
            int r0 = r5.A04
            if (r6 >= r0) goto L_0x018c
            X.07E r0 = r3.A08
            float r0 = r0.getPageWidth(r6)
            float r0 = r0 + r7
            float r1 = r1 + r0
            int r6 = r6 + 1
            goto L_0x017d
        L_0x018c:
            r5.A02 = r1
            float r0 = r5.A03
            float r0 = r0 + r7
            float r1 = r1 + r0
            goto L_0x015c
        L_0x0193:
            r7 = 0
            goto L_0x014d
        L_0x0195:
            if (r6 <= r0) goto L_0x01cc
            int r0 = r10.size()
            int r5 = r0 + -1
            float r4 = r11.A02
        L_0x019f:
            int r6 = r6 + -1
            int r0 = r8.A04
            if (r6 < r0) goto L_0x01cc
            if (r5 < 0) goto L_0x01cc
        L_0x01a7:
            java.lang.Object r1 = r10.get(r5)
            X.07I r1 = (X.AnonymousClass07I) r1
            int r0 = r1.A04
            if (r6 >= r0) goto L_0x01b6
            if (r5 <= 0) goto L_0x01b6
            int r5 = r5 + -1
            goto L_0x01a7
        L_0x01b6:
            int r0 = r1.A04
            if (r6 <= r0) goto L_0x01c5
            X.07E r0 = r3.A08
            float r0 = r0.getPageWidth(r6)
            float r0 = r0 + r7
            float r4 = r4 - r0
            int r6 = r6 + -1
            goto L_0x01b6
        L_0x01c5:
            float r0 = r1.A03
            float r0 = r0 + r7
            float r4 = r4 - r0
            r1.A02 = r4
            goto L_0x019f
        L_0x01cc:
            int r6 = r10.size()
            float r11 = r8.A02
            int r1 = r8.A04
            int r12 = r1 + -1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r1 != 0) goto L_0x01dc
            r0 = r11
        L_0x01dc:
            r3.A00 = r0
            int r5 = r13 + -1
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r5) goto L_0x0215
            float r0 = r8.A03
            float r0 = r0 + r11
            float r0 = r0 - r13
        L_0x01e8:
            r3.A01 = r0
            int r4 = r2 + -1
        L_0x01ec:
            if (r4 < 0) goto L_0x0219
            java.lang.Object r2 = r10.get(r4)
            X.07I r2 = (X.AnonymousClass07I) r2
        L_0x01f4:
            int r0 = r2.A04
            if (r12 <= r0) goto L_0x0204
            X.07E r0 = r3.A08
            int r1 = r12 + -1
            float r0 = r0.getPageWidth(r12)
            float r0 = r0 + r7
            float r11 = r11 - r0
            r12 = r1
            goto L_0x01f4
        L_0x0204:
            float r0 = r2.A03
            float r0 = r0 + r7
            float r11 = r11 - r0
            r2.A02 = r11
            int r0 = r2.A04
            if (r0 != 0) goto L_0x0210
            r3.A00 = r11
        L_0x0210:
            int r4 = r4 + -1
            int r12 = r12 + -1
            goto L_0x01ec
        L_0x0215:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x01e8
        L_0x0219:
            float r4 = r8.A02
            float r0 = r8.A03
            float r4 = r4 + r0
            float r4 = r4 + r7
            int r0 = r8.A04
            int r11 = r0 + 1
        L_0x0223:
            if (r9 >= r6) goto L_0x0250
            java.lang.Object r2 = r10.get(r9)
            X.07I r2 = (X.AnonymousClass07I) r2
        L_0x022b:
            int r0 = r2.A04
            if (r11 >= r0) goto L_0x023b
            X.07E r0 = r3.A08
            int r1 = r11 + 1
            float r0 = r0.getPageWidth(r11)
            float r0 = r0 + r7
            float r4 = r4 + r0
            r11 = r1
            goto L_0x022b
        L_0x023b:
            int r0 = r2.A04
            if (r0 != r5) goto L_0x0245
            float r0 = r2.A03
            float r0 = r0 + r4
            float r0 = r0 - r13
            r3.A01 = r0
        L_0x0245:
            r2.A02 = r4
            float r0 = r2.A03
            float r0 = r0 + r7
            float r4 = r4 + r0
            int r9 = r9 + 1
            int r11 = r11 + 1
            goto L_0x0223
        L_0x0250:
            X.07E r2 = r3.A08
            int r1 = r3.A02
            java.lang.Object r0 = r8.A00
            r2.setPrimaryItem((android.view.ViewGroup) r3, (int) r1, (java.lang.Object) r0)
        L_0x0259:
            X.07E r0 = r3.A08
            r0.finishUpdate((android.view.ViewGroup) r3)
            int r5 = r3.getChildCount()
            r4 = 0
        L_0x0263:
            if (r4 >= r5) goto L_0x0286
            android.view.View r2 = r3.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.07J r1 = (X.AnonymousClass07J) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0283
            float r0 = r1.A00
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0283
            X.07I r0 = r3.A0E(r2)
            if (r0 == 0) goto L_0x0283
            float r0 = r0.A03
            r1.A00 = r0
        L_0x0283:
            int r4 = r4 + 1
            goto L_0x0263
        L_0x0286:
            boolean r0 = r3.hasFocus()
            if (r0 == 0) goto L_0x0323
            android.view.View r0 = r3.findFocus()
            if (r0 == 0) goto L_0x02ac
        L_0x0292:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == r3) goto L_0x02a0
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x02ac
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            goto L_0x0292
        L_0x02a0:
            X.07I r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x02ac
            int r1 = r0.A04
            int r0 = r3.A02
            if (r1 == r0) goto L_0x0323
        L_0x02ac:
            r4 = 0
        L_0x02ad:
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L_0x0323
            android.view.View r2 = r3.getChildAt(r4)
            X.07I r0 = r3.A0E(r2)
            if (r0 == 0) goto L_0x02cb
            int r1 = r0.A04
            int r0 = r3.A02
            if (r1 != r0) goto L_0x02cb
            r0 = 2
            boolean r0 = r2.requestFocus(r0)
            if (r0 == 0) goto L_0x02cb
            return
        L_0x02cb:
            int r4 = r4 + 1
            goto L_0x02ad
        L_0x02ce:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ NotFoundException -> 0x02db }
            int r0 = r3.getId()     // Catch:{ NotFoundException -> 0x02db }
            java.lang.String r2 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x02db }
            goto L_0x02e3
        L_0x02db:
            int r0 = r3.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
        L_0x02e3:
            java.lang.String r0 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.A0P
            r1.append(r0)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " Pager id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " Pager class: "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            r1.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r1.append(r0)
            X.07E r0 = r3.A08
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0323:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0G(int):void");
    }

    public void A0H(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.A0N > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                AnonymousClass07J r1 = (AnonymousClass07J) childAt.getLayoutParams();
                if (r1.A03) {
                    int i6 = r1.A02 & 7;
                    if (i6 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) >> 1, paddingLeft);
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    } else if (i6 == 3) {
                        i4 = childAt.getWidth() + paddingLeft;
                    } else if (i6 != 5) {
                        i4 = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i4;
                }
            }
        }
        AnonymousClass07L r0 = this.A09;
        if (r0 != null) {
            r0.onPageScrolled(i, f, i2);
        }
        List list = this.A0B;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                AnonymousClass07L r02 = (AnonymousClass07L) this.A0B.get(i7);
                if (r02 != null) {
                    r02.onPageScrolled(i, f, i2);
                }
            }
        }
        this.A0c = true;
    }

    public void A0I(int i, int i2, boolean z, boolean z2) {
        AnonymousClass07E r0 = this.A08;
        boolean z3 = false;
        if (r0 == null || r0.getCount() <= 0 || (!z2 && this.A02 == i && this.A0h.size() != 0)) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A08.getCount()) {
            i = this.A08.getCount() - 1;
        }
        int i3 = this.A0T;
        int i4 = this.A02;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.A0h;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((AnonymousClass07I) arrayList.get(i5)).A01 = true;
                i5++;
            }
        }
        if (i4 != i) {
            z3 = true;
        }
        if (this.A0d) {
            this.A02 = i;
            if (z3) {
                A04(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A06(i, i2, z, z3);
    }

    public void A0L(AnonymousClass07L r2) {
        List list = this.A0B;
        if (list == null) {
            list = new ArrayList();
            this.A0B = list;
        }
        list.add(r2);
    }

    public final boolean A0M() {
        AnonymousClass07E r0 = this.A08;
        if (r0 == null || this.A02 >= r0.getCount() - 1) {
            return false;
        }
        A0J(this.A02 + 1, true);
        return true;
    }

    public final boolean A0O(View view, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (A0O(childAt, i5, i6 - childAt.getLeft(), i4 - childAt.getTop(), true)) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.A08 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.A00))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.A01))) {
            return false;
        }
        return true;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof AnonymousClass07J) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass07J();
    }

    public final int getChildDrawingOrder(int i, int i2) {
        throw new NullPointerException("get");
    }

    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A03 > 0 && this.A0Y != null) {
            ArrayList arrayList = this.A0h;
            if (arrayList.size() > 0 && this.A08 != null) {
                int scrollX = getScrollX();
                int width = getWidth();
                float f2 = (float) width;
                float f3 = ((float) this.A03) / f2;
                int i = 0;
                AnonymousClass07I r5 = (AnonymousClass07I) arrayList.get(0);
                float f4 = r5.A02;
                int size = arrayList.size();
                int i2 = r5.A04;
                int i3 = ((AnonymousClass07I) arrayList.get(size - 1)).A04;
                while (i2 < i3) {
                    while (i2 > r5.A04 && i < size) {
                        i++;
                        r5 = (AnonymousClass07I) arrayList.get(i);
                    }
                    if (i2 == r5.A04) {
                        float f5 = r5.A02 + r5.A03;
                        f = f5 * f2;
                        f4 = f5 + f3;
                    } else {
                        float pageWidth = this.A08.getPageWidth(i2);
                        f = (f4 + pageWidth) * f2;
                        f4 += pageWidth + f3;
                    }
                    float f6 = ((float) this.A03) + f;
                    if (f6 > ((float) scrollX)) {
                        this.A0Y.setBounds(Math.round(f), this.A0W, Math.round(f6), this.A0L);
                        this.A0Y.draw(canvas2);
                    }
                    if (f <= ((float) (scrollX + width))) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        if (action == 3 || action == 1) {
            A09();
            return false;
        }
        if (action != 0) {
            if (this.A0D) {
                return true;
            }
            if (this.A0F) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent2.getX();
            this.A0G = x;
            this.A0I = x;
            float y = motionEvent2.getY();
            this.A0H = y;
            this.A0J = y;
            this.A0K = motionEvent2.getPointerId(0);
            this.A0F = false;
            this.A0E = true;
            this.A07.computeScrollOffset();
            if (this.A0V == 2 && Math.abs(this.A07.getFinalX() - this.A07.getCurrX()) > this.A0M) {
                this.A07.abortAnimation();
                this.A0f = false;
                A0G(this.A02);
                this.A0D = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else if (AnonymousClass7Ax.A00(this.A05) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && AnonymousClass7Ax.A00(this.A06) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                A08(false);
                this.A0D = false;
            } else {
                this.A0D = true;
                setScrollState(1);
                if (AnonymousClass7Ax.A00(this.A05) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    AnonymousClass7Ax.A01(this.A05, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f - (this.A0J / ((float) getHeight())));
                }
                if (AnonymousClass7Ax.A00(this.A06) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    AnonymousClass7Ax.A01(this.A06, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0J / ((float) getHeight()));
                }
            }
        } else if (action == 2) {
            int i = this.A0K;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.A0I;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.A0H);
                if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    float f3 = this.A0I;
                    if (this.A0C || ((f3 >= ((float) this.mGutterSize) || f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && (f3 <= ((float) (getWidth() - this.mGutterSize)) || f2 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER))) {
                        if (A0O(this, (int) f2, (int) x2, (int) y2, false)) {
                            this.A0I = x2;
                            this.A0J = y2;
                            this.A0F = true;
                            return false;
                        }
                    }
                }
                float f4 = (float) this.A0X;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.A0D = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    int i2 = (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
                    float f5 = this.A0G;
                    float f6 = (float) this.A0X;
                    if (i2 > 0) {
                        f = f5 + f6;
                    } else {
                        f = f5 - f6;
                    }
                    this.A0I = f;
                    this.A0J = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f4) {
                    this.A0F = true;
                }
                if (this.A0D && A0A(x2, y2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            A07(motionEvent2);
        }
        VelocityTracker velocityTracker = this.A04;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A04 = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent2);
        return this.A0D;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        AnonymousClass07E r2 = this.A08;
        if (r2 != null) {
            r2.restoreState(savedState.A01, savedState.A02);
            A0I(savedState.A00, 0, false, true);
            return;
        }
        this.A0U = savedState.A00;
        this.A0Z = savedState.A01;
        this.A0b = savedState.A02;
    }

    public final void removeView(View view) {
        if (this.A0e) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AnonymousClass07E r8) {
        ArrayList arrayList;
        AnonymousClass07E r0 = this.A08;
        if (r0 != null) {
            r0.setViewPagerObserver((DataSetObserver) null);
            this.A08.startUpdate((ViewGroup) this);
            int i = 0;
            while (true) {
                arrayList = this.A0h;
                if (i >= arrayList.size()) {
                    break;
                }
                AnonymousClass07I r02 = (AnonymousClass07I) arrayList.get(i);
                this.A08.destroyItem((ViewGroup) this, r02.A04, r02.A00);
                i++;
            }
            this.A08.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((AnonymousClass07J) getChildAt(i2).getLayoutParams()).A03) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A02 = 0;
            scrollTo(0, 0);
        }
        AnonymousClass07E r3 = this.A08;
        this.A08 = r8;
        this.A0P = 0;
        if (r8 != null) {
            AnonymousClass07N r1 = this.A0a;
            if (r1 == null) {
                r1 = new AnonymousClass07N(this);
                this.A0a = r1;
            }
            this.A08.setViewPagerObserver(r1);
            this.A0f = false;
            boolean z = this.A0d;
            this.A0d = true;
            this.A0P = this.A08.getCount();
            if (this.A0U >= 0) {
                this.A08.restoreState(this.A0Z, this.A0b);
                A0I(this.A0U, 0, false, true);
                this.A0U = -1;
                this.A0Z = null;
                this.A0b = null;
            } else if (!z) {
                A0G(this.A02);
            } else {
                requestLayout();
            }
        }
        List list = this.A0A;
        if (list != null && !list.isEmpty()) {
            int size = this.A0A.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AnonymousClass07K) this.A0A.get(i3)).Bjk(r3, r8, this);
            }
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.A03;
        this.A03 = i;
        int width = getWidth();
        A05(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0Y = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0V != i) {
            this.A0V = i;
            AnonymousClass07L r0 = this.A09;
            if (r0 != null) {
                r0.onPageScrollStateChanged(i);
            }
            List list = this.A0B;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass07L r02 = (AnonymousClass07L) this.A0B.get(i2);
                    if (r02 != null) {
                        r02.onPageScrollStateChanged(i);
                    }
                }
            }
        }
    }

    public ViewPager(Context context) {
        super(context);
        A0K(context);
    }

    private float A00(float f, float f2) {
        float height = f2 / ((float) getHeight());
        float width = f / ((float) getWidth());
        float A002 = AnonymousClass7Ax.A00(this.A05);
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (A002 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f3 = -AnonymousClass7Ax.A01(this.A05, -width, 1.0f - height);
        } else if (AnonymousClass7Ax.A00(this.A06) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f3 = AnonymousClass7Ax.A01(this.A06, width, height);
        }
        return f3 * ((float) getWidth());
    }

    private int A01(float f, int i, int i2, int i3) {
        if (Math.abs(i3) <= this.A0Q || Math.abs(i2) <= this.A0S || AnonymousClass7Ax.A00(this.A05) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || AnonymousClass7Ax.A00(this.A06) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f2 = 0.6f;
            if (i >= this.A02) {
                f2 = 0.4f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        ArrayList arrayList = this.A0h;
        if (arrayList.size() > 0) {
            return Math.max(((AnonymousClass07I) arrayList.get(0)).A04, Math.min(i, ((AnonymousClass07I) arrayList.get(arrayList.size() - 1)).A04));
        }
        return i;
    }

    private AnonymousClass07I A03() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (clientWidth > 0) {
            float f4 = (float) clientWidth;
            f = ((float) getScrollX()) / f4;
            f2 = ((float) this.A03) / f4;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        AnonymousClass07I r11 = null;
        float f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i3 >= arrayList.size()) {
                break;
            }
            AnonymousClass07I r3 = (AnonymousClass07I) arrayList.get(i3);
            if (!z && r3.A04 != (i = i2 + 1)) {
                r3 = this.A0j;
                r3.A02 = f3 + f5 + f2;
                r3.A04 = i;
                r3.A03 = this.A08.getPageWidth(i);
                i3--;
            }
            f3 = r3.A02;
            f5 = r3.A03;
            float f6 = f5 + f3 + f2;
            if (!z && f < f3) {
                break;
            } else if (f < f6 || i3 == arrayList.size() - 1) {
                return r3;
            } else {
                i2 = r3.A04;
                i3++;
                r11 = r3;
                z = false;
            }
        }
        return r11;
    }

    private void A06(int i, int i2, boolean z, boolean z2) {
        int i3;
        int scrollX;
        int pageWidth;
        AnonymousClass07I A0C2 = A0C(i);
        if (A0C2 != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.A00, Math.min(A0C2.A02, this.A01)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.A07;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    boolean z3 = this.A0E;
                    Scroller scroller2 = this.A07;
                    if (z3) {
                        scrollX = scroller2.getCurrX();
                    } else {
                        scrollX = scroller2.getStartX();
                    }
                    this.A07.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    A08(false);
                    A0G(this.A02);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float abs = (float) Math.abs(i4);
                    float f = (float) clientWidth;
                    float f2 = (float) (clientWidth >> 1);
                    float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, (abs * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2);
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        pageWidth = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) << 2;
                    } else {
                        pageWidth = (int) (((abs / ((f * this.A08.getPageWidth(this.A02)) + ((float) this.A03))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(pageWidth, 600);
                    this.A0E = false;
                    this.A07.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                A04(i);
                return;
            }
            return;
        }
        if (z2) {
            A04(i);
        }
        A08(false);
        scrollTo(i3, 0);
        A0B(i3);
    }

    private void A07(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0K) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0I = motionEvent.getX(i);
            this.A0K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r1 >= r0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r8 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r1 <= r0) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0N(int r8) {
        /*
            r7 = this;
            android.view.View r5 = r7.findFocus()
            r3 = 1
            r4 = 0
            r6 = 0
            if (r5 == r7) goto L_0x0056
            if (r5 == 0) goto L_0x0057
            android.view.ViewParent r1 = r5.getParent()
        L_0x000f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001a
            if (r1 == r7) goto L_0x0057
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000f
        L_0x001a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r5.getParent()
        L_0x002e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x002e
        L_0x0047:
            java.lang.String r1 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L_0x0056:
            r5 = r6
        L_0x0057:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r7, r5, r8)
            r1 = 66
            r0 = 17
            if (r6 == 0) goto L_0x008e
            if (r6 == r5) goto L_0x008e
            if (r8 != r0) goto L_0x0098
            android.graphics.Rect r2 = r7.A0i
            android.graphics.Rect r0 = r7.A02(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A02(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto L_0x00b1
            if (r1 < r0) goto L_0x00b1
        L_0x007b:
            int r0 = r7.A02
            if (r0 <= 0) goto L_0x0084
            r4 = 1
            int r0 = r0 - r3
            r7.A0J(r0, r3)
        L_0x0084:
            if (r4 == 0) goto L_0x008d
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        L_0x008d:
            return r4
        L_0x008e:
            if (r8 == r0) goto L_0x007b
            if (r8 == r3) goto L_0x007b
            if (r8 == r1) goto L_0x00ac
            r0 = 2
            if (r8 != r0) goto L_0x008d
            goto L_0x00ac
        L_0x0098:
            if (r8 != r1) goto L_0x008d
            android.graphics.Rect r2 = r7.A0i
            android.graphics.Rect r0 = r7.A02(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A02(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto L_0x00b1
            if (r1 > r0) goto L_0x00b1
        L_0x00ac:
            boolean r4 = r7.A0M()
            goto L_0x0084
        L_0x00b1:
            boolean r4 = r6.requestFocus()
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0N(int):boolean");
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AnonymousClass07I A0E2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A0E2 = A0E(childAt)) != null && A0E2.A04 == this.A02) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new AnonymousClass07J();
        }
        AnonymousClass07J r3 = (AnonymousClass07J) layoutParams;
        boolean z = r3.A03;
        boolean z2 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z2 = true;
        }
        boolean z3 = z | z2;
        r3.A03 = z3;
        if (!this.A0e) {
            super.addView(view, i, layoutParams);
        } else if (!z3) {
            r3.A01 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.dispatchKeyEvent(r4)
            if (r0 != 0) goto L_0x0030
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x0053
            int r2 = r4.getKeyCode()
            r0 = 21
            r1 = 2
            if (r2 == r0) goto L_0x0040
            r0 = 22
            if (r2 == r0) goto L_0x0032
            r0 = 61
            if (r2 != r0) goto L_0x0053
            boolean r0 = r4.hasNoModifiers()
            if (r0 != 0) goto L_0x002a
            r1 = 1
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L_0x0053
        L_0x002a:
            boolean r0 = r3.A0N(r1)
        L_0x002e:
            if (r0 == 0) goto L_0x0053
        L_0x0030:
            r0 = 1
            return r0
        L_0x0032:
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r3.A0M()
            goto L_0x002e
        L_0x003d:
            r1 = 66
            goto L_0x002a
        L_0x0040:
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L_0x0050
            int r1 = r3.A02
            if (r1 <= 0) goto L_0x0053
            r0 = 1
            int r1 = r1 - r0
            r3.A0J(r1, r0)
            goto L_0x0030
        L_0x0050:
            r1 = 17
            goto L_0x002a
        L_0x0053:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass07I A0E2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0E2 = A0E(childAt)) != null && A0E2.A04 == this.A02 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass07E r0;
        int A032 = C14030oh.A03(-633887212);
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.A08) != null && r0.getCount() > 1)) {
            if (!this.A05.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.A00 * ((float) width));
                this.A05.setSize(height, width);
                z = false | this.A05.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A06.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A01 + 1.0f)) * ((float) width2));
                this.A06.setSize(height2, width2);
                z |= this.A06.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                postInvalidateOnAnimation();
            }
        } else {
            this.A05.finish();
            this.A06.finish();
        }
        C14030oh.A0A(-1861943805, A032);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Y;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass07J(getContext(), attributeSet);
    }

    public AnonymousClass07E getAdapter() {
        return this.A08;
    }

    public int getCurrentItem() {
        return this.A02;
    }

    public int getOffscreenPageLimit() {
        return this.A0T;
    }

    public int getPageMargin() {
        return this.A03;
    }

    public void onAttachedToWindow() {
        int A062 = C14030oh.A06(-782663130);
        super.onAttachedToWindow();
        this.A0d = true;
        C14030oh.A0D(-1814596170, A062);
    }

    public void onDetachedFromWindow() {
        int A062 = C14030oh.A06(1408290646);
        removeCallbacks(this.A0k);
        Scroller scroller = this.A07;
        if (scroller != null && !scroller.isFinished()) {
            this.A07.abortAnimation();
        }
        super.onDetachedFromWindow();
        C14030oh.A0D(753494652, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        AnonymousClass07I A0E2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                AnonymousClass07J r3 = (AnonymousClass07J) childAt.getLayoutParams();
                if (r3.A03) {
                    int i13 = r3.A02;
                    int i14 = i13 & 7;
                    int i15 = i13 & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) >> 1, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i14 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i15 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) >> 1, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i15 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i16 = paddingLeft + scrollX;
                    childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i17 = (i9 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                AnonymousClass07J r12 = (AnonymousClass07J) childAt2.getLayoutParams();
                if (!r12.A03 && (A0E2 = A0E(childAt2)) != null) {
                    float f = (float) i17;
                    int i19 = ((int) (A0E2.A02 * f)) + paddingLeft;
                    if (r12.A01) {
                        r12.A01 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * r12.A00), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.A0W = paddingTop;
        this.A0L = i10 - paddingBottom;
        this.A0N = i11;
        if (this.A0d) {
            z2 = false;
            A06(this.A02, 0, false, false);
        } else {
            z2 = false;
        }
        this.A0d = z2;
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        AnonymousClass07I A0E2;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = childCount - 1;
        int i4 = -1;
        if ((i & 2) != 0) {
            i2 = childCount;
            i3 = 0;
            i4 = 1;
        }
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (A0E2 = A0E(childAt)) != null && A0E2.A04 == this.A02 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = this.A02;
        AnonymousClass07E r0 = this.A08;
        if (r0 != null) {
            savedState.A01 = r0.saveState();
        }
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = C14030oh.A06(-2075028882);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A03;
            A05(i, i3, i5, i5);
        }
        C14030oh.A0D(-1549034334, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        if (r3 != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = -649692108(0xffffffffd9467c34, float:-3.49178801E15)
            int r2 = X.C14030oh.A05(r0)
            r1 = 1
            int r0 = r10.getAction()
            r4 = 0
            if (r0 != 0) goto L_0x001c
            int r0 = r10.getEdgeFlags()
            if (r0 == 0) goto L_0x001c
            r0 = -961796525(0xffffffffc6ac2653, float:-22035.162)
        L_0x0018:
            X.C14030oh.A0C(r0, r2)
            return r4
        L_0x001c:
            X.07E r0 = r9.A08
            if (r0 == 0) goto L_0x0184
            int r0 = r0.getCount()
            if (r0 == 0) goto L_0x0184
            android.view.VelocityTracker r0 = r9.A04
            if (r0 != 0) goto L_0x0030
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A04 = r0
        L_0x0030:
            r0.addMovement(r10)
            int r0 = r10.getAction()
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0160
            r8 = 0
            if (r3 == r1) goto L_0x006c
            r0 = 2
            if (r3 == r0) goto L_0x00dd
            r0 = 3
            if (r3 == r0) goto L_0x0152
            r0 = 5
            if (r3 == r0) goto L_0x0060
            r0 = 6
            if (r3 != r0) goto L_0x0059
            r9.A07(r10)
            int r0 = r9.A0K
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getX(r0)
            r9.A0I = r0
        L_0x0059:
            r0 = -878972735(0xffffffffcb9bf0c1, float:-2.0439426E7)
            X.C14030oh.A0C(r0, r2)
            return r1
        L_0x0060:
            int r4 = r10.getActionIndex()
            float r0 = r10.getX(r4)
            r9.A0I = r0
            goto L_0x017c
        L_0x006c:
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0059
            android.view.VelocityTracker r4 = r9.A04
            r3 = 1000(0x3e8, float:1.401E-42)
            int r0 = r9.A0R
            float r0 = (float) r0
            r4.computeCurrentVelocity(r3, r0)
            int r0 = r9.A0K
            float r0 = r4.getXVelocity(r0)
            int r4 = (int) r0
            r9.A0f = r1
            int r6 = r9.getClientWidth()
            int r5 = r9.getScrollX()
            X.07I r7 = r9.A03()
            int r0 = r9.A03
            float r3 = (float) r0
            float r0 = (float) r6
            float r3 = r3 / r0
            int r6 = r7.A04
            float r5 = (float) r5
            float r5 = r5 / r0
            float r0 = r7.A02
            float r5 = r5 - r0
            float r0 = r7.A03
            float r0 = r0 + r3
            float r5 = r5 / r0
            int r0 = r9.A0K
            int r0 = r10.findPointerIndex(r0)
            float r3 = r10.getX(r0)
            float r0 = r9.A0G
            float r3 = r3 - r0
            int r0 = (int) r3
            int r0 = r9.A01(r5, r6, r4, r0)
            r9.A0I(r0, r4, r1, r1)
            boolean r3 = r9.A09()
            if (r0 != r6) goto L_0x014c
            if (r3 == 0) goto L_0x0059
            android.widget.EdgeEffect r0 = r9.A06
            float r0 = X.AnonymousClass7Ax.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            android.widget.EdgeEffect r0 = r9.A06
            int r4 = -r4
        L_0x00c9:
            r0.onAbsorb(r4)
        L_0x00cc:
            r9.postInvalidateOnAnimation()
            goto L_0x0059
        L_0x00d0:
            android.widget.EdgeEffect r0 = r9.A05
            float r0 = X.AnonymousClass7Ax.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            android.widget.EdgeEffect r0 = r9.A05
            goto L_0x00c9
        L_0x00dd:
            boolean r0 = r9.A0D
            if (r0 != 0) goto L_0x0136
            int r0 = r9.A0K
            int r3 = r10.findPointerIndex(r0)
            r0 = -1
            if (r3 == r0) goto L_0x015b
            float r6 = r10.getX(r3)
            float r0 = r9.A0I
            float r0 = r6 - r0
            float r4 = java.lang.Math.abs(r0)
            float r5 = r10.getY(r3)
            float r0 = r9.A0J
            float r0 = r5 - r0
            float r3 = java.lang.Math.abs(r0)
            int r0 = r9.A0X
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            r9.A0D = r1
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L_0x0118
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0118:
            float r4 = r9.A0G
            float r6 = r6 - r4
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r0 = r9.A0X
            float r0 = (float) r0
            if (r3 <= 0) goto L_0x0150
            float r4 = r4 + r0
        L_0x0123:
            r9.A0I = r4
            r9.A0J = r5
            r9.setScrollState(r1)
            r9.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L_0x0136
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0136:
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0059
            int r0 = r9.A0K
            int r0 = r10.findPointerIndex(r0)
            float r3 = r10.getX(r0)
            float r0 = r10.getY(r0)
            boolean r3 = r9.A0A(r3, r0)
        L_0x014c:
            if (r3 == 0) goto L_0x0059
            goto L_0x00cc
        L_0x0150:
            float r4 = r4 - r0
            goto L_0x0123
        L_0x0152:
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0059
            int r0 = r9.A02
            r9.A06(r0, r4, r1, r4)
        L_0x015b:
            boolean r3 = r9.A09()
            goto L_0x014c
        L_0x0160:
            android.widget.Scroller r0 = r9.A07
            r0.abortAnimation()
            r9.A0f = r4
            int r0 = r9.A02
            r9.A0G(r0)
            float r0 = r10.getX()
            r9.A0G = r0
            r9.A0I = r0
            float r0 = r10.getY()
            r9.A0H = r0
            r9.A0J = r0
        L_0x017c:
            int r0 = r10.getPointerId(r4)
            r9.A0K = r0
            goto L_0x0059
        L_0x0184:
            r0 = -576202369(0xffffffffdda7d97f, float:-1.51185474E18)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0Y) {
            return true;
        }
        return false;
    }

    public void setDragInGutterEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOnPageChangeListener(AnonymousClass07L r1) {
        this.A09 = r1;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K(context);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass07J();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }
}
