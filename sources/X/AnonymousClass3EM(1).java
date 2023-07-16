package X;

import android.os.Bundle;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;

/* renamed from: X.3EM  reason: invalid class name */
public final class AnonymousClass3EM {
    public final /* synthetic */ LocationDetailFragment A00;

    public AnonymousClass3EM(LocationDetailFragment locationDetailFragment) {
        this.A00 = locationDetailFragment;
    }

    public final void A00(MediaMapPin mediaMapPin) {
        LocationDetailFragment locationDetailFragment = this.A00;
        Venue A02 = mediaMapPin.A02();
        if (mediaMapPin.A06 != null) {
            Bundle A06 = C18180wK.A06();
            A06.putString("location_id_key", A02.getId());
            A06.putString("fb_page_id_key", A02.A04());
            A06.putString("info_page_logging_entry_point", "map_location_sheet");
            A06.putParcelable("location_page_info", mediaMapPin.A06);
            C63863iT.A0D(locationDetailFragment, C63863iT.A05(locationDetailFragment.getActivity(), A06, locationDetailFragment.A00, ModalActivity.class, I17.A00(278)));
        }
    }
}
