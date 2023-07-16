package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.08v  reason: invalid class name and case insensitive filesystem */
public class C018908v extends Fragment {
    public View A00;
    public TextView A01;
    public View A02;
    public View A03;
    public ListAdapter A04;
    public ListView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new C011005b(this);
    public final Runnable A09 = new AnonymousClass05a(this);

    public static void A00(C018908v r4) {
        if (r4.A05 == null) {
            View view = r4.mView;
            if (view != null) {
                if (view instanceof ListView) {
                    r4.A05 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    r4.A01 = textView;
                    if (textView == null) {
                        r4.A00 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    r4.A03 = view.findViewById(16711682);
                    r4.A02 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        r4.A05 = listView;
                        View view2 = r4.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                r4.A06 = true;
                r4.A05.setOnItemClickListener(r4.A08);
                ListAdapter listAdapter = r4.A04;
                if (listAdapter != null) {
                    r4.A04 = null;
                    r4.A0F(listAdapter);
                } else if (r4.A03 != null) {
                    A00(r4);
                    View view3 = r4.A03;
                    if (view3 == null) {
                        throw new IllegalStateException("Can't be used with a custom content view");
                    } else if (r4.A06) {
                        r4.A06 = false;
                        view3.clearAnimation();
                        r4.A02.clearAnimation();
                        r4.A03.setVisibility(0);
                        r4.A02.setVisibility(8);
                    }
                }
                r4.A07.post(r4.A09);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public final void A0F(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = false;
        if (this.A04 != null) {
            z2 = true;
        }
        this.A04 = listAdapter;
        ListView listView = this.A05;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                A00(this);
                View view = this.A03;
                if (view == null) {
                    throw new IllegalStateException("Can't be used with a custom content view");
                } else if (!this.A06) {
                    this.A06 = true;
                    if (z) {
                        view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                        this.A02.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                    } else {
                        view.clearAnimation();
                        this.A02.clearAnimation();
                    }
                    this.A03.setVisibility(8);
                    this.A02.setVisibility(0);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(732328672);
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C14030oh.A09(481075429, A022);
        return frameLayout;
    }

    public void onDestroyView() {
        int A022 = C14030oh.A02(389730494);
        this.A07.removeCallbacks(this.A09);
        this.A05 = null;
        this.A06 = false;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
        super.onDestroyView();
        C14030oh.A09(749372918, A022);
    }

    public void onViewCreated(View view, Bundle bundle) {
        A00(this);
    }
}
