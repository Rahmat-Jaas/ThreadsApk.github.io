package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.1YI  reason: invalid class name */
public final class AnonymousClass1YI extends C34640IcN {
    public static final String __redex_internal_original_name = "BirthdayMockDialogWithFullScreenOverlayFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "birthday_mock_dialog_with_full_screen_overlay";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04620Ok r1;
        UserSession userSession;
        ContentResolver contentResolver;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0K = C18220wO.A0K(view, R.id.full_screen_overlay_imageview);
        Context requireContext = requireContext();
        C04220Ms.A04(A0K);
        Drawable drawable = requireContext.getDrawable(R.drawable.ig_birthday_celebrations_confetti_fullscreen_gradient_dogfooding);
        C04220Ms.A06(drawable);
        A0K.setImageDrawable(drawable);
        C25702DqQ.A02(A0K.getDrawable());
        IgImageView igImageView = (IgImageView) view.findViewById(R.id.mock_dialog_circular_imageview);
        Bundle requireArguments = requireArguments();
        if (requireArguments.isEmpty() || requireArguments.getString("BUNDLE_BIRTHDAY_SELFIE_BITMAP_FILE_URI") == null) {
            r1 = C06810aP.A01;
            userSession = this.A00;
            if (userSession == null) {
                C04220Ms.A0E("userSession");
                throw null;
            }
        } else {
            Uri A01 = C15430rJ.A01(requireArguments.getString("BUNDLE_BIRTHDAY_SELFIE_BITMAP_FILE_URI"));
            try {
                Context context = getContext();
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                igImageView.setImageBitmap(MediaStore.Images.Media.getBitmap(contentResolver, A01));
            } catch (IOException unused) {
                r1 = C06810aP.A01;
                userSession = this.A00;
                if (userSession == null) {
                    C04220Ms.A0E("userSession");
                    throw null;
                }
            }
            CircularImageView circularImageView = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
            Context requireContext2 = requireContext();
            C04220Ms.A04(circularImageView);
            C25702DqQ.A01(requireContext2, circularImageView);
            C25702DqQ.A02(circularImageView.getDrawable());
            AnonymousClass0wJ.A17(view.findViewById(R.id.mock_dialog_primary_button), 232, this);
        }
        C18220wO.A1L(this, igImageView, r1.A01(userSession));
        CircularImageView circularImageView2 = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
        Context requireContext22 = requireContext();
        C04220Ms.A04(circularImageView2);
        C25702DqQ.A01(requireContext22, circularImageView2);
        C25702DqQ.A02(circularImageView2.getDrawable());
        AnonymousClass0wJ.A17(view.findViewById(R.id.mock_dialog_primary_button), 232, this);
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1006644866);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        C14030oh.A09(-350308647, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1280458042);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.mock_dialog_with_full_screen_overlay_fragment, viewGroup, false);
        C14030oh.A09(1235981375, A02);
        return inflate;
    }
}
