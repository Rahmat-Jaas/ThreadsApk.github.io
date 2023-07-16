package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;

/* renamed from: X.5fw  reason: invalid class name and case insensitive filesystem */
public class C91275fw extends F6h {
    public C111296n6 A00;

    public void onViewCreated(View view, Bundle bundle) {
        ResolvedConsentTextsProvider resolvedConsentTextsProvider;
        C04220Ms.A0B(view, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (resolvedConsentTextsProvider = (ResolvedConsentTextsProvider) bundle2.getParcelable(C28174Ezk.A00(796))) == null) {
            throw new IllegalArgumentException();
        }
        requireContext();
        this.A00 = resolvedConsentTextsProvider.A00;
    }
}
