package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.7Ls  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C122237Ls implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogInterface.OnShowListener A00;
    public final /* synthetic */ C25828Dsm A01;

    public /* synthetic */ C122237Ls(DialogInterface.OnShowListener onShowListener, C25828Dsm dsm) {
        this.A01 = dsm;
        this.A00 = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        WindowManager windowManager;
        C25828Dsm dsm = this.A01;
        DialogInterface.OnShowListener onShowListener = this.A00;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Dialog dialog = dsm.A05;
        dialog.getWindow().getClass();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int height = (int) (((float) dialog.getWindow().getDecorView().getHeight()) / C86134wK.A00());
        Context context = dsm.A06;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            windowManager = (WindowManager) systemService;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int A002 = ((int) (((float) displayMetrics.heightPixels) / C86134wK.A00())) - 120;
        if (height > A002) {
            layoutParams.height = (int) (((float) A002) * C86134wK.A00());
        }
        dialog.getWindow().setAttributes(layoutParams);
        if (dsm.A01 != null) {
            dsm.A07.postDelayed(new AnonymousClass806(dsm), 1000);
        }
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }
}
