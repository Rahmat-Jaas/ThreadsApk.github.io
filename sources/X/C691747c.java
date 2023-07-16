package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.47c  reason: invalid class name and case insensitive filesystem */
public final class C691747c implements C10420iJ {
    public Activity A00;
    public Dialog A01;
    public Dialog A02;
    public BugReport A03;
    public BugReportComposerViewModel A04;
    public AnonymousClass1jI A05;
    public final UserSession A06;

    public final void BjV(Activity activity) {
    }

    public final void BjW(Activity activity) {
    }

    public final void Bjc(Activity activity) {
    }

    public final void Bjd(Activity activity) {
    }

    public static void A00(Bitmap bitmap, C691747c r9) {
        UserSession userSession = r9.A06;
        Activity activity = r9.A00;
        activity.getClass();
        BugReport bugReport = r9.A03;
        bugReport.getClass();
        BugReportComposerViewModel bugReportComposerViewModel = r9.A04;
        bugReportComposerViewModel.getClass();
        AnonymousClass1jI r1 = new AnonymousClass1jI(activity, bitmap, bugReport, bugReportComposerViewModel, (C61593Uj) null, userSession);
        r9.A05 = r1;
        r1.A02(new Void[0]);
    }

    public final void BjY(Activity activity) {
        AnonymousClass1jI r0 = this.A05;
        if (r0 != null) {
            r0.A06();
            this.A05 = null;
        }
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.dismiss();
            this.A02 = null;
        }
        Dialog dialog2 = this.A01;
        if (dialog2 != null) {
            dialog2.dismiss();
            this.A01 = null;
        }
        this.A00 = null;
    }

    public C691747c(UserSession userSession) {
        this.A06 = userSession;
    }

    public final void BjX(Activity activity) {
        if (activity.isFinishing() && (activity instanceof BugReporterActivity) && this.A03 == null && C34442Jo.A00()) {
            C10410iI.A00.A01(this);
        }
    }

    public final void Bjb(Activity activity) {
        activity.getClass();
        this.A00 = activity;
        if (activity instanceof BugReporterActivity) {
            this.A03 = null;
        }
        if (this.A03 != null) {
            int color = activity.getColor(R.color.bugreporter_take_screenshot);
            ImageView imageView = (ImageView) LayoutInflater.from(this.A00).inflate(R.layout.bugreporter_screen_capture_button, (ViewGroup) null, false);
            imageView.setImageResource(R.drawable.take_screenshot_icon);
            C18210wN.A0y(imageView);
            AnonymousClass0wJ.A16(imageView, 98, this);
            Activity activity2 = this.A00;
            activity2.getClass();
            Dialog dialog = new Dialog(activity2);
            dialog.setContentView(imageView);
            Window window = dialog.getWindow();
            window.getClass();
            window.addFlags(40);
            window.clearFlags(2);
            window.setGravity(85);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = this.A00.getResources().getDimensionPixelOffset(R.dimen.account_section_text_margin_horizontal);
            attributes.y = this.A00.getResources().getDimensionPixelOffset(R.dimen.abc_list_item_height_material);
            window.setAttributes(attributes);
            this.A02 = dialog;
            TextView textView = (TextView) LayoutInflater.from(this.A00).inflate(R.layout.bugreporter_cancel_banner, (ViewGroup) null, false);
            textView.setText(2131822737);
            textView.setBackgroundColor(color);
            AnonymousClass0wJ.A16(textView, 99, this);
            Dialog dialog2 = new Dialog(this.A00);
            this.A01 = dialog2;
            dialog2.setContentView(textView);
            Window window2 = this.A01.getWindow();
            window2.getClass();
            window2.addFlags(40);
            window2.clearFlags(2);
            window2.setGravity(48);
            WindowManager.LayoutParams attributes2 = window2.getAttributes();
            attributes2.width = -1;
            attributes2.height = -2;
            window2.setAttributes(attributes2);
            C13950oZ.A00(this.A02);
            C13950oZ.A00(this.A01);
        }
    }
}
