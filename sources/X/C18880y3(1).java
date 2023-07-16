package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.forker.Process;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.List;
import java.util.Map;

/* renamed from: X.0y3  reason: invalid class name and case insensitive filesystem */
public final class C18880y3 extends BaseAdapter {
    public BusinessFlowAnalyticsLogger A00;
    public String A01;
    public int A02;
    public C10300i6 A03;
    public boolean A04;
    public boolean A05;
    public final List A06;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C10300i6 r6;
        if (view == null) {
            view = C18180wK.A0C(viewGroup).inflate(R.layout.slide_card_with_headline, viewGroup, false);
        }
        IgdsHeadline A0S = C18240wQ.A0S(view, R.id.headline);
        SlideCardViewModel slideCardViewModel = (SlideCardViewModel) this.A06.get(i);
        if (!this.A05 || (r6 = this.A03) == null || !C67333zN.A06(r6, 36313252702979469L, false)) {
            View findViewById = view.findViewById(R.id.image);
            View findViewById2 = view.findViewById(R.id.circular_image);
            int i2 = slideCardViewModel.A02;
            if (i2 != 0) {
                A0S.setImageDrawable(C30845GYu.A00(viewGroup.getResources(), i2));
            } else {
                int i3 = slideCardViewModel.A01;
                if (i3 != 0) {
                    A0S.A08(i3, false);
                } else {
                    ImageUrl imageUrl = slideCardViewModel.A06;
                    if (imageUrl != null) {
                        A0S.setCircularImageUrl(imageUrl, (String) null);
                    } else {
                        ImageUrl imageUrl2 = slideCardViewModel.A07;
                        if (imageUrl2 != null) {
                            A0S.setImageURL(imageUrl2, (C11630kW) null);
                        } else if (!(findViewById2 == null || findViewById == null)) {
                            findViewById2.setVisibility(8);
                            findViewById.setVisibility(8);
                        }
                    }
                }
            }
            int i4 = slideCardViewModel.A00;
            if (i4 != 0) {
                view.setBackgroundResource(i4);
            }
            String str = slideCardViewModel.A0A;
            if (str != null) {
                TextView A0L = AnonymousClass0wJ.A0L(view, R.id.link2);
                C18180wK.A0s(A0L.getContext(), A0L, R.color.igds_primary_button);
                A0L.setText(str);
                View.OnClickListener onClickListener = slideCardViewModel.A05;
                if (onClickListener != null) {
                    A0L.setOnClickListener(onClickListener);
                }
                A0L.setVisibility(0);
            } else {
                View findViewById3 = view.findViewById(R.id.link2);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
            }
            CharSequence charSequence = slideCardViewModel.A08;
            if (charSequence != null) {
                A0S.setSupportingText(charSequence);
            }
            View findViewById4 = view.findViewById(R.id.row_divider);
            if (findViewById4 != null) {
                if (!this.A04 || slideCardViewModel.A07 != null) {
                    findViewById4.setVisibility(8);
                } else {
                    findViewById4.setVisibility(0);
                }
            }
        } else {
            List<SlideCardViewModel.SlideCardSectionViewModel> list = slideCardViewModel.A0D;
            if (list != null) {
                for (SlideCardViewModel.SlideCardSectionViewModel slideCardSectionViewModel : list) {
                    int i5 = slideCardSectionViewModel.A03;
                    View findViewById5 = view.findViewById(i5);
                    if (findViewById5 == null) {
                        Context context = viewGroup.getContext();
                        View inflate = LayoutInflater.from(context).inflate(R.layout.slide_card_section, viewGroup, false);
                        inflate.setId(i5);
                        String str2 = slideCardSectionViewModel.A08;
                        if (!TextUtils.isEmpty(str2)) {
                            TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.section_title);
                            A0L2.setText(str2);
                            A0L2.setVisibility(0);
                        }
                        String str3 = slideCardSectionViewModel.A07;
                        if (!TextUtils.isEmpty(str3)) {
                            TextView A0L3 = AnonymousClass0wJ.A0L(inflate, R.id.section_description);
                            A0L3.setText(str3);
                            A0L3.setVisibility(0);
                        }
                        int i6 = slideCardSectionViewModel.A01;
                        if (i6 != 0) {
                            ImageView A0J = C18200wM.A0J(inflate, R.id.section_icon);
                            C18180wK.A0r(context, A0J, i6);
                            A0J.setVisibility(0);
                        }
                        if (slideCardSectionViewModel.A09) {
                            View requireViewById = inflate.requireViewById(R.id.video_container);
                            requireViewById.setVisibility(0);
                            requireViewById.setClipToOutline(true);
                            C18190wL.A18(inflate, R.id.loading_indicator, 0);
                            int i7 = slideCardSectionViewModel.A02;
                            if (i7 != 0) {
                                Drawable drawable = context.getDrawable(i7);
                                ImageView A0J2 = C18200wM.A0J(inflate, R.id.video_placeholder);
                                A0J2.setImageDrawable(drawable);
                                A0J2.setVisibility(0);
                            }
                        }
                        Uri uri = slideCardSectionViewModel.A05;
                        if (uri != null) {
                            A01(uri, (VideoView) inflate.requireViewById(R.id.video));
                        }
                        int i8 = slideCardSectionViewModel.A00;
                        if (i8 != 0) {
                            inflate.setBackgroundResource(i8);
                        }
                        String str4 = slideCardSectionViewModel.A06;
                        if (!TextUtils.isEmpty(str4)) {
                            IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(65, (Object) this, (Object) viewGroup, (Object) slideCardSectionViewModel);
                            TextView A0L4 = AnonymousClass0wJ.A0L(inflate, R.id.section_link);
                            A0L4.setText(str4);
                            A0L4.setOnClickListener(iDxCListenerShape41S0300000_1_I2);
                            A0L4.setVisibility(0);
                        }
                        ((ViewGroup) view).addView(inflate, -1);
                    } else {
                        VideoView videoView = (VideoView) findViewById5.findViewById(R.id.video);
                        if (videoView != null) {
                            videoView.start();
                        }
                    }
                }
            }
            ImageUrl imageUrl3 = slideCardViewModel.A06;
            if (imageUrl3 != null) {
                A0S.setCircularImageUrl(imageUrl3, (String) null);
            }
        }
        String str5 = slideCardViewModel.A0C;
        if (str5 != null) {
            A0S.setHeadline((CharSequence) str5);
        }
        String str6 = slideCardViewModel.A0B;
        if (str6 != null) {
            A0S.setBody(str6, (View.OnClickListener) null);
        } else {
            String str7 = slideCardViewModel.A09;
            if (str7 != null) {
                A0S.setLink(str7, slideCardViewModel.A04);
                return view;
            }
        }
        return view;
    }

    public static void A00(C18880y3 r9) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r9.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("value_props_video", r9.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final int getCount() {
        return this.A06.size();
    }

    public final Object getItem(int i) {
        return this.A06.get(i);
    }

    public C18880y3(ViewGroup viewGroup, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C10300i6 r10, String str, List list, boolean z, boolean z2) {
        int i;
        this.A06 = list;
        this.A04 = z;
        this.A03 = r10;
        this.A00 = businessFlowAnalyticsLogger;
        this.A01 = str;
        this.A05 = z2;
        DisplayMetrics A0E = C18230wP.A0E(viewGroup.getContext());
        int i2 = 0;
        while (true) {
            if (i2 >= this.A06.size()) {
                break;
            }
            View view = getView(i2, (View) null, viewGroup);
            if (view.requireViewById(R.id.placeholder).getVisibility() == 0) {
                this.A02 = -1;
                break;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(A0E.widthPixels, Process.WAIT_RESULT_TIMEOUT), 0);
            if (this.A02 < view.getMeasuredHeight()) {
                i = view.getMeasuredHeight();
            } else {
                i = this.A02;
            }
            this.A02 = i;
            i2++;
        }
        viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A02));
    }

    public final void A01(Uri uri, VideoView videoView) {
        ViewParent parent = videoView.getParent();
        parent.getClass();
        View view = (View) parent;
        C18200wM.A1D(view, R.id.loading_indicator);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.setOnPreparedListener(new C64443kU(view, videoView, this));
        videoView.setOnCompletionListener(new C64393kP(videoView, this));
        videoView.start();
    }
}
