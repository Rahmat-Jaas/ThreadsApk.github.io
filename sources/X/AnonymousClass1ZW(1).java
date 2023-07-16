package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.bugreporter.BugReporterDrawingView;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZW  reason: invalid class name */
public final class AnonymousClass1ZW extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ImageAnnotationFragment";
    public BugReporterDrawingView A00;
    public String A01;
    public C10300i6 A02;
    public UserSession A03;

    public final String getModuleName() {
        return "bugreporter_imageannotation";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.Crr(new C25348Dk8(C18190wL.A0H(this, 95), AnonymousClass0wJ.A0B(this).getString(2131822718), 0));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1238735364);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        this.A02 = r1.A02(requireArguments);
        this.A03 = C18180wK.A0W(this, r1);
        this.A01 = requireArguments().getString("ImageAnnotationFragment.imagePath");
        C14030oh.A09(-308083909, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1399108374);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bugreporter_image_annotation);
        this.A00 = (BugReporterDrawingView) A0H.requireViewById(R.id.drawing_view);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.A01);
        BugReporterDrawingView bugReporterDrawingView = this.A00;
        bugReporterDrawingView.A03 = decodeFile;
        BugReporterDrawingView.A00(bugReporterDrawingView);
        C14030oh.A09(258920345, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1908958001);
        super.onDestroyView();
        this.A00.A01();
        this.A00 = null;
        C14030oh.A09(-2011697828, A022);
    }
}
