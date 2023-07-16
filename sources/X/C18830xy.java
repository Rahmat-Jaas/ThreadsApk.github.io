package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.VideoView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.slidecardpageadapter.SlideVideoCardViewModel;
import java.util.List;

/* renamed from: X.0xy  reason: invalid class name and case insensitive filesystem */
public final class C18830xy extends BaseAdapter {
    public ReboundViewPager A00;
    public int A01 = R.layout.slide_video_card_container;
    public final List A02;

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C18180wK.A0C(viewGroup).inflate(this.A01, viewGroup, false);
        }
        List list = this.A02;
        SlideVideoCardViewModel slideVideoCardViewModel = (SlideVideoCardViewModel) list.get(i);
        VideoView videoView = (VideoView) view.requireViewById(R.id.video);
        Uri uri = ((SlideVideoCardViewModel) list.get(i)).A04;
        if (uri != null) {
            videoView.setVideoURI(uri);
            videoView.requestFocus();
        }
        videoView.setOnPreparedListener(new C64433kT(videoView, this));
        videoView.setOnCompletionListener(new C64403kQ(viewGroup, videoView, this, i));
        videoView.setVisibility(0);
        String str = slideVideoCardViewModel.A03;
        if (str != null) {
            AnonymousClass0wJ.A0L(view, R.id.title).setText(str);
            C18190wL.A18(view, R.id.title, 0);
        }
        String str2 = slideVideoCardViewModel.A02;
        View requireViewById = view.requireViewById(R.id.subtitle);
        if (str2 != null) {
            TextView textView = (TextView) requireViewById;
            textView.setText(str2);
            textView.setVisibility(0);
        } else {
            requireViewById.setVisibility(8);
        }
        String str3 = slideVideoCardViewModel.A01;
        if (str3 != null) {
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.description);
            A0L.setText(str3);
            A0L.setVisibility(0);
        }
        View findViewById = view.findViewById(R.id.row_divider);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        return view;
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    public C18830xy(ViewGroup viewGroup, List list) {
        ReboundViewPager reboundViewPager;
        this.A02 = list;
        if (viewGroup instanceof ReboundViewPager) {
            reboundViewPager = (ReboundViewPager) viewGroup;
        } else {
            reboundViewPager = null;
        }
        this.A00 = reboundViewPager;
        for (int i = 0; i < this.A02.size(); i++) {
            getView(i, (View) null, viewGroup);
        }
    }
}
