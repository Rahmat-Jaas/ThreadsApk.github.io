package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.SpritesheetInfo;

/* renamed from: X.7IR  reason: invalid class name */
public final class AnonymousClass7IR {
    public IgImageView A00;
    public C149158t2 A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04;
    public final int A05;
    public final int A06;
    public final PopupWindow A07;
    public final C109996kx A08;
    public final AnonymousClass51W A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final View A0F;
    public final TextView A0G;
    public final TextView A0H;

    public AnonymousClass7IR(Context context, C109996kx r12, AnonymousClass51W r13, int i) {
        int i2;
        int i3;
        this.A0E = context;
        this.A08 = r12;
        this.A09 = r13;
        View A0D2 = C18180wK.A0D(LayoutInflater.from(context), new LinearLayout(context), R.layout.insights_line_chart_tooltip_layout, false);
        this.A0F = A0D2;
        SpritesheetInfo spritesheetInfo = r12.A01;
        if (spritesheetInfo != null) {
            this.A00 = (IgImageView) A0D2.findViewById(R.id.insights_line_chart_tooltip_thumbnail_view);
            this.A01 = new C149158t2(spritesheetInfo, new C134277xM(this), (Integer) null, (float) C86124wJ.A08(context), false);
        } else {
            ViewGroup.LayoutParams layoutParams = A0D2.getLayoutParams();
            if (this.A00 == null) {
                i2 = this.A05;
            } else {
                i2 = this.A06;
            }
            layoutParams.height = i2;
            A0D2.setLayoutParams(A0D2.getLayoutParams());
        }
        float[] fArr = r12.A03;
        this.A02 = fArr[0];
        this.A0G = C18180wK.A0G(A0D2, R.id.insights_line_chart_tooltip_retention_text);
        this.A0H = C18180wK.A0G(A0D2, R.id.insights_line_chart_tooltip_timestamp_text);
        A02(fArr[i]);
        A03(r12.A02[i]);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.abc_floating_window_z) + C86114wI.A05(context);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + C18220wO.A01(context, R.dimen.abc_floating_window_z);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.insights_line_chart_tooltip_container_width);
        this.A0D = dimensionPixelSize;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.insights_line_chart_tooltip_container_height);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        this.A0C = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        Rect A0D3 = C86134wK.A0D();
        Activity activity = (Activity) context;
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(A0D3);
            this.A04 += A0D3.top;
        }
        this.A04 += E2V.A03(activity).AOg();
        if (this.A00 == null) {
            i3 = this.A05;
        } else {
            i3 = this.A06;
        }
        PopupWindow popupWindow = new PopupWindow(A0D2, dimensionPixelSize, i3, false);
        this.A07 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        A04(i);
    }

    private final int A00() {
        int i;
        int[] iArr = new int[2];
        this.A09.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        if (this.A00 == null) {
            i = this.A05;
        } else {
            i = this.A06;
        }
        int i3 = (i2 - i) + (this.A0C << 1);
        int i4 = this.A04;
        if (i2 < i4) {
            return -1;
        }
        if (i3 < i4) {
            return i4;
        }
        return i3;
    }

    private final int A01(int i) {
        int i2 = this.A0B;
        int i3 = this.A08.A00;
        float measuredWidth = (((float) ((this.A09.getMeasuredWidth() - this.A0A) - i2)) * 1.0f) / ((float) (i3 - 1));
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = ((float) i4) * measuredWidth;
        }
        return (int) ((fArr[i] + ((float) i2)) - C86134wK.A01(this.A0D));
    }

    private final void A02(float f) {
        int i = (int) ((f / this.A02) * ((float) 100));
        TextView textView = this.A0G;
        if (textView != null) {
            textView.setText(C18190wL.A0h(this.A0E.getResources(), String.valueOf(i), 2131834948));
        }
    }

    private final void A03(float f) {
        String valueOf;
        int i = (int) (f / ((float) 1000));
        int i2 = i / 60;
        int i3 = i % 60;
        String valueOf2 = String.valueOf(i2);
        if (i3 < 10) {
            valueOf = AnonymousClass00U.A0J("0", i3);
        } else {
            valueOf = String.valueOf(i3);
        }
        TextView textView = this.A0H;
        if (textView != null) {
            textView.setText(this.A0E.getResources().getString(2131834949, new Object[]{valueOf2, valueOf}));
        }
    }

    public final void A04(int i) {
        int i2;
        Rect A0D2 = C86134wK.A0D();
        AnonymousClass51W r3 = this.A09;
        r3.getGlobalVisibleRect(A0D2);
        PopupWindow popupWindow = this.A07;
        popupWindow.setTouchInterceptor(new C122317Rc(A0D2, this));
        if (this.A03 != i) {
            C109996kx r1 = this.A08;
            A02(r1.A03[i]);
            float[] fArr = r1.A02;
            A03(fArr[i]);
            C149158t2 r2 = this.A01;
            if (r2 != null) {
                r2.A00 = (int) (((float) r2.A02.size()) * (((float) i) / ((float) fArr.length)));
                r2.invalidateSelf();
            }
            this.A03 = i;
        }
        if (A00() == -1) {
            popupWindow.dismiss();
        } else if (!popupWindow.isShowing()) {
            popupWindow.showAtLocation(r3, 0, A01(i), A00());
        } else {
            int A012 = A01(i);
            int A002 = A00();
            int i3 = this.A0D;
            if (this.A00 == null) {
                i2 = this.A05;
            } else {
                i2 = this.A06;
            }
            popupWindow.update(A012, A002, i3, i2);
        }
    }
}
