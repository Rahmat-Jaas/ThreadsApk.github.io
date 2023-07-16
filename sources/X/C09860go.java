package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.concurrent.Callable;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public final class C09860go {
    public static Point A00;
    public static final RectF A01 = new RectF();
    public static final int[] A02 = new int[2];

    public static int A04(Context context) {
        Point point = A00;
        if (point == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            point = new Point();
            defaultDisplay.getRealSize(point);
            A00 = point;
        }
        return point.y;
    }

    public static int A05(Context context) {
        Point point = A00;
        if (point == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            point = new Point();
            defaultDisplay.getRealSize(point);
            A00 = point;
        }
        return point.x;
    }

    public static Point A0B(Context context) {
        Point point = A00;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        defaultDisplay.getRealSize(point2);
        A00 = point2;
        return point2;
    }

    public static RectF A0C(View view) {
        RectF rectF = new RectF();
        A0G(rectF, view);
        return rectF;
    }

    public static DisplayMetrics A0D(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void A0G(RectF rectF, View view) {
        int[] iArr = A02;
        view.getLocationInWindow(iArr);
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        rectF.set(f, f2, (((float) view.getWidth()) * view.getScaleX()) + f, (((float) view.getHeight()) * view.getScaleY()) + f2);
    }

    public static void A0I(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void A0J(View view) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static void A0e(View view, View view2, int i) {
        A0g(view, new C09920gx(view, i, view2));
    }

    public static void A0f(View view, View view2, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.addOnLayoutChangeListener(new AnonymousClass0h2(view, view2, z));
        }
    }

    public static void A0h(View view, Runnable runnable) {
        view.addOnLayoutChangeListener(new C09880gq(runnable));
    }

    public static void A0i(View view, Runnable runnable) {
        C09870gp r0 = new C09870gp(runnable);
        view.addOnLayoutChangeListener(r0);
        view.addOnAttachStateChangeListener(r0);
    }

    public static void A0l(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            throw new IllegalArgumentException("Given null or dead view tree observer.");
        }
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static boolean A0n(View view, float f, float f2) {
        float f3 = f2;
        float f4 = f;
        int[] iArr = new int[2];
        View view2 = view;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        RectF rectF = new RectF((float) i, (float) iArr[1], (float) (i + view.getMeasuredWidth()), (float) (iArr[1] + view.getMeasuredHeight()));
        if (Float.compare(view.getRotation(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0) {
            return rectF.contains(f4, f3);
        }
        float f5 = rectF.left;
        float f6 = rectF.top;
        float pivotX = view.getPivotX();
        float pivotY = view.getPivotY();
        double radians = Math.toRadians((double) (-view.getRotation()));
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (double) (f5 - pivotX);
        double d2 = (double) (f6 - pivotY);
        PointF pointF = new PointF((float) (((d * cos) - (d2 * sin)) + ((double) pivotX)), (float) ((d * sin) + (d2 * cos) + ((double) pivotY)));
        float pivotX2 = view2.getPivotX();
        float pivotY2 = view2.getPivotY();
        double radians2 = Math.toRadians((double) (-view2.getRotation()));
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double d3 = (double) (f4 - pivotX2);
        double d4 = (double) (f3 - pivotY2);
        PointF pointF2 = new PointF((float) (((d3 * cos2) - (d4 * sin2)) + ((double) pivotX2)), (float) ((d3 * sin2) + (d4 * cos2) + ((double) pivotY2)));
        float f7 = pointF.x;
        return new RectF(f7, pointF.y, f7 + ((float) view2.getWidth()), pointF.y + ((float) view2.getHeight())).contains(pointF2.x, pointF2.y);
    }

    public static float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float A01(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float A02(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static float A03(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static int A06(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier <= 0 || identifier2 <= 0 || !resources.getBoolean(identifier2)) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static int A07(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int A08(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int A09(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int A0A(View view) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public static void A0E(Activity activity) {
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        Window window = activity.getWindow();
        if (window != null && (windowToken = window.getDecorView().getWindowToken()) != null && (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public static void A0F(Context context, View view, int i) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.setColorFilter(context.getColor(i), PorterDuff.Mode.SRC_OVER);
        }
    }

    public static void A0H(View view) {
        view.getClass();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    public static void A0K(View view) {
        view.getClass();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static void A0L(View view) {
        view.getClass();
        view.postDelayed(new AnonymousClass0h0(view), 60);
    }

    public static void A0M(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0N(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0O(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.widget.LinearLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.FrameLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.widget.LinearLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.widget.LinearLayout$LayoutParams} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0P(android.view.View r2, int r3) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x0014
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r3
        L_0x0010:
            r2.setLayoutParams(r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0013
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r3
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09860go.A0P(android.view.View, int):void");
    }

    public static void A0Q(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void A0R(View view, int i) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0S(View view, int i) {
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void A0T(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void A0U(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void A0V(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0W(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0X(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0Y(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A0Z(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void A0a(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A0b(View view, int i, int i2) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
    }

    public static void A0c(View view, int i, int i2, int i3, int i4) {
        Context context = view.getContext();
        view.setPadding((int) A03(context, i), (int) A03(context, i2), (int) A03(context, i3), (int) A03(context, i4));
    }

    public static void A0d(View view, int i, int i2, int i3, int i4) {
        Resources resources = view.getResources();
        view.setPadding(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3), resources.getDimensionPixelSize(i4));
    }

    public static void A0g(View view, Runnable runnable) {
        view.getClass();
        if (view.isLaidOut()) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new AnonymousClass0h4(view, runnable));
        }
    }

    public static void A0j(View view, Callable callable) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new C09900gu(view, viewTreeObserver, callable));
    }

    public static void A0k(View view, Callable callable, Callable callable2, int i) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Handler handler = new Handler();
        C09890gt r0 = new C09890gt(handler, view, viewTreeObserver, callable);
        AnonymousClass0gr r2 = new AnonymousClass0gr(view, r0, viewTreeObserver, callable2);
        viewTreeObserver.addOnPreDrawListener(r0);
        handler.postDelayed(r2, (long) i);
    }

    public static boolean A0m(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 2) == 0 && (systemUiVisibility & 512) == 0 && (systemUiVisibility & 4) == 0) {
            return false;
        }
        return true;
    }

    public static boolean A0o(View view, MotionEvent motionEvent) {
        float f = 0.8f;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            f = 1.0f;
        }
        view.setAlpha(f);
        return false;
    }

    public static boolean A0p(TextView textView) {
        if (textView.getText().length() == 0) {
            return true;
        }
        return false;
    }
}
