package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape258S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape217S0200000_1_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.facebook.redex.IDxObserverShape212S0100000_3_I2;
import com.facebook.redex.IDxObserverShape54S0300000_1_I2;
import com.facebook.redex.IDxObserverShape98S0200000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;

/* renamed from: X.1cq  reason: invalid class name and case insensitive filesystem */
public final class C23251cq extends C34640IcN implements C144658ir {
    public static final String __redex_internal_original_name = "DictionaryManagerFragment";
    public RecyclerView A00;
    public E2V A01;
    public AnonymousClass10S A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public ViewGroup A07;
    public C84464tB A08;
    public final C04530Oa A09 = C80644m9.A00(this);

    public final String getModuleName() {
        return "muted_words_dictionary_editor";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = new E2V((View.OnClickListener) null, C18220wO.A0J(view, R.id.dictionary_manager_action_bar));
        AnonymousClass10S r0 = this.A02;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        r0.A01.A0C(this, new IDxObserverShape98S0200000_1_I2(10, view, this));
        AnonymousClass10S r02 = this.A02;
        if (r02 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        r02.A02.A0C(this, new IDxObserverShape212S0100000_3_I2(new IDxObserverShape210S0100000_1_I2(this, 23), 53));
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.dictionary_manager_new_words_input_field);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.dictionary_manager_new_words_add_button);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.dictionary_manager_new_words_divider);
        Integer num = this.A03;
        if (num == null) {
            str = "surfaceType";
        } else {
            int i = 0;
            if (num == AnonymousClass006.A01) {
                i = 8;
            }
            A0K.setVisibility(i);
            textView.setImeOptions(6);
            textView.setRawInputType(1);
            textView.setOnFocusChangeListener(new IDxCListenerShape217S0200000_1_I2(2, A0K2, this));
            C18230wP.A17(textView, A0K, 9);
            textView.setOnEditorActionListener(new IDxAListenerShape258S0200000_1_I2(0, this, textView));
            AnonymousClass0wJ.A18(A0K, 79, this, textView);
            AnonymousClass10S r03 = this.A02;
            if (r03 != null) {
                r03.A01.A0C(this, new IDxObserverShape54S0300000_1_I2(3, A0K, textView, this));
                C18489AgL A0Y = C18220wO.A0Y(this);
                A0Y.A01(new AnonymousClass1kW(new KtLambdaShape158S0100000_I2_13(this, 29)));
                A0Y.A01(new C24861kk(new KtLambdaShape158S0100000_I2_13(this, 30), new KtLambdaShape158S0100000_I2_13(this, 31)));
                C150388wA A0Z = C18220wO.A0Z(A0Y, new AnonymousClass1kX(new KtLambdaShape158S0100000_I2_13(this, 32)));
                RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.dictionary_manager_words_list);
                this.A00 = recyclerView;
                str = "wordsList";
                if (recyclerView != null) {
                    recyclerView.setAdapter(A0Z);
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        getContext();
                        C18190wL.A1D(recyclerView2);
                        RecyclerView recyclerView3 = this.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.A0U = true;
                            AnonymousClass10S r04 = this.A02;
                            if (r04 != null) {
                                r04.A03.A0C(this, new IDxObserverShape98S0200000_1_I2(11, A0Z, this));
                                View A0K3 = AnonymousClass0wJ.A0K(view, R.id.dictionary_manager_upsell_description);
                                View A0K4 = AnonymousClass0wJ.A0K(view, R.id.dictionary_manager_description);
                                String str2 = this.A04;
                                str = "entryPoint";
                                if (str2 != null) {
                                    int i2 = 0;
                                    A0K3.setVisibility(C18190wL.A00(str2.equals("upsell") ? 1 : 0));
                                    String str3 = this.A04;
                                    if (str3 != null) {
                                        if (str3.equals("upsell")) {
                                            i2 = 8;
                                        }
                                        A0K4.setVisibility(i2);
                                        C84464tB r05 = this.A08;
                                        if (r05 == null) {
                                            str = "keyboardHeightChangeDetector";
                                        } else {
                                            r05.A6s(this);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str = "viewModel";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void C46(int i, boolean z) {
        ViewGroup viewGroup = this.A07;
        if (viewGroup == null) {
            C04220Ms.A0E("wordsListViewGroup");
            throw null;
        } else {
            C09860go.A0Q(viewGroup, i);
        }
    }

    public final void beforeOnPause() {
        if (!this.A05 && !this.A06) {
            AnonymousClass10S r1 = this.A02;
            if (r1 == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(r1, (C146958n9) null, 12), r1.A07, 3);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A09);
    }

    public static final void A00(EditText editText, C23251cq r9) {
        String A0n = AnonymousClass0wJ.A0n(editText);
        if (A0n.length() > 0) {
            AnonymousClass10S r5 = r9.A02;
            if (r5 == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            C25237DiI.A00((Integer) null, r5.A06, new KtSLambdaShape3S1100000_I2(r5, A0n, (C146958n9) null, 9), AnonymousClass3J5.A00(r5), 2);
            RecyclerView recyclerView = r9.A00;
            if (recyclerView == null) {
                C04220Ms.A0E("wordsList");
                throw null;
            }
            recyclerView.A0l(0);
        }
        C18250wR.A0t(editText);
        editText.clearFocus();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 461919448(0x1b8854d8, float:2.2554142E-22)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r8)
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "dictionary_manager_entrypoint"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = "bloks"
        L_0x0018:
            r7.A04 = r0
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "dictionary_manager_surface_name"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x004b
            r0 = 2
            java.lang.Integer[] r5 = X.AnonymousClass006.A00(r0)
            int r4 = r5.length
            r2 = 0
        L_0x002d:
            if (r2 >= r4) goto L_0x0047
            r1 = r5[r2]
            int r0 = r1.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "ig_muted_words_comments_and_messages"
        L_0x003b:
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 != 0) goto L_0x0049
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0044:
            java.lang.String r0 = "ig_muted_words_posts"
            goto L_0x003b
        L_0x0047:
            java.lang.Integer r1 = X.C549230x.A00
        L_0x0049:
            if (r1 != 0) goto L_0x004d
        L_0x004b:
            java.lang.Integer r1 = X.C549230x.A00
        L_0x004d:
            r7.A03 = r1
            X.0Oa r6 = r7.A09
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r6)
            java.lang.String r0 = "muted_words_dictionary_editor"
            X.0rm r4 = new X.0rm
            r4.<init>(r0)
            java.lang.Integer r1 = r7.A03
            java.lang.String r2 = "surfaceType"
            if (r1 == 0) goto L_0x0088
            X.3xd r0 = new X.3xd
            r0.<init>(r4, r5, r1)
            X.7IU r1 = new X.7IU
            r1.<init>((X.C147138nS) r0, (X.AnonymousClass06C) r7)
            java.lang.Class<X.10S> r0 = X.AnonymousClass10S.class
            X.3ak r0 = r1.A01(r0)
            X.10S r0 = (X.AnonymousClass10S) r0
            r7.A02 = r0
            java.lang.Integer r1 = r7.A03
            if (r1 == 0) goto L_0x0088
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x00ae
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r6)
            java.lang.String r2 = r7.A04
            if (r2 != 0) goto L_0x008d
            java.lang.String r2 = "entryPoint"
        L_0x0088:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x008d:
            X.0nS r1 = X.C18220wO.A0V(r7, r0)
            java.lang.String r0 = "words_and_phrases_page"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2926(0xb6e, float:4.1E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "event_source"
            r1.A0T(r0, r2)
            X.C18180wK.A1C(r1, r7)
            r1.Bb4()
        L_0x00ae:
            r0 = -900454421(0xffffffffca5427eb, float:-3475962.8)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23251cq.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C84464tB A012;
        int A022 = C14030oh.A02(1192969018);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dictionary_manager_fragment_layout, viewGroup, false);
        this.A07 = (ViewGroup) AnonymousClass0wJ.A0I(inflate, R.id.dictionary_manager_words_list);
        if (Build.VERSION.SDK_INT >= 30) {
            A012 = C25711DqZ.A00(inflate);
        } else {
            A012 = C25711DqZ.A01(this, false, false);
        }
        this.A08 = A012;
        C14030oh.A09(302879630, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1184004162);
        super.onDestroyView();
        C84464tB r0 = this.A08;
        if (r0 == null) {
            C04220Ms.A0E("keyboardHeightChangeDetector");
            throw null;
        }
        r0.Cc8(this);
        C14030oh.A09(1813984164, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1606408682);
        super.onStart();
        C84464tB r1 = this.A08;
        if (r1 == null) {
            C04220Ms.A0E("keyboardHeightChangeDetector");
            throw null;
        }
        r1.CLs(requireActivity());
        C14030oh.A09(1578214522, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1624798163);
        super.onStop();
        C84464tB r0 = this.A08;
        if (r0 == null) {
            C04220Ms.A0E("keyboardHeightChangeDetector");
            throw null;
        }
        r0.onStop();
        C14030oh.A09(32756376, A022);
    }
}
