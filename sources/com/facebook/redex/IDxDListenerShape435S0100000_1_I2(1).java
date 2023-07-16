package com.facebook.redex;

import X.AnonymousClass0BO;
import X.AnonymousClass0hW;
import X.AnonymousClass0wJ;
import X.AnonymousClass38I;
import X.AnonymousClass3G8;
import X.C04220Ms;
import X.C09990hX;
import X.C10450iM;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C25828Dsm;
import X.C37408JrQ;
import X.C62353Yv;
import X.C72144Mm;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class IDxDListenerShape435S0100000_1_I2 implements C09990hX {
    public Object A00;
    public final int A01;

    public IDxDListenerShape435S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        AnonymousClass38I r0;
        User user;
        FragmentActivity activity;
        AtomicBoolean atomicBoolean;
        Context requireContext;
        int i;
        Object[] objArr;
        Object valueOf;
        String string;
        Object obj2 = obj;
        if (this.A01 != 0) {
            ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A00;
            if (shareLaterFragment.mView != null && (activity = shareLaterFragment.getActivity()) != null && shareLaterFragment.isAdded() && !shareLaterFragment.mRemoving && !shareLaterFragment.mDetached && !activity.isFinishing() && (atomicBoolean = shareLaterFragment.A0A) != null && !atomicBoolean.getAndSet(true)) {
                AnonymousClass0hW r02 = shareLaterFragment.A01;
                r02.getClass();
                r02.A00();
                C18230wP.A0R(shareLaterFragment).setIsLoading(false);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                C10450iM.A03("configure_share_media", "XPosting Configure Targets are not set up correctly");
                if (A0v.size() < 1) {
                    string = shareLaterFragment.requireContext().getString(2131834837);
                } else {
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    Iterator it = A0v.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        UserSession userSession = shareLaterFragment.A04;
                        ArrayList A0v3 = AnonymousClass0wJ.A0v();
                        C62353Yv A002 = C62353Yv.A00(userSession);
                        HashSet A0u = C18200wM.A0u();
                        A0u.addAll(A002.A00.keySet());
                        A0u.addAll(A002.A01.keySet());
                        C04220Ms.A0B(userSession, 0);
                        AnonymousClass0BO r03 = userSession.multipleAccountHelper;
                        String userId = userSession.getUserId();
                        C04220Ms.A0B(userId, 0);
                        for (C72144Mm r1 : AnonymousClass0BO.A02(r03.A00.A05(userId))) {
                            if (!A0u.contains(r1.A01())) {
                                A0v3.add(r1);
                            }
                        }
                        for (C72144Mm r12 : Collections.unmodifiableList(A0v3)) {
                            if (A0k.equals(r12.A01())) {
                                A0v2.add(r12.A02());
                            }
                        }
                    }
                    if (A0v2.size() == 1) {
                        requireContext = shareLaterFragment.requireContext();
                        i = 2131835759;
                        objArr = new Object[]{A0v2.get(0)};
                    } else if (A0v2.size() == 2) {
                        requireContext = shareLaterFragment.requireContext();
                        i = 2131835762;
                        objArr = new Object[]{A0v2.get(0), A0v2.get(1)};
                    } else {
                        if (A0v2.size() == 3) {
                            requireContext = shareLaterFragment.requireContext();
                            i = 2131835760;
                            objArr = new Object[3];
                            objArr[0] = A0v2.get(0);
                            objArr[1] = A0v2.get(1);
                            valueOf = A0v2.get(2);
                        } else {
                            requireContext = shareLaterFragment.requireContext();
                            i = 2131835758;
                            objArr = new Object[3];
                            objArr[0] = A0v2.get(0);
                            objArr[1] = A0v2.get(1);
                            valueOf = Integer.valueOf(A0v2.size() - 2);
                        }
                        objArr[2] = valueOf;
                    }
                    string = requireContext.getString(i, objArr);
                }
                C25828Dsm A0V = AnonymousClass0wJ.A0V(shareLaterFragment);
                A0V.A0L(2131835761);
                A0V.A0p(string);
                C18180wK.A1O(A0V, shareLaterFragment, 37, 2131831976);
                AnonymousClass0wJ.A1K(A0V);
                return;
            }
            return;
        }
        Pair pair = (Pair) obj2;
        AnonymousClass3G8 r5 = (AnonymousClass3G8) this.A00;
        C04220Ms.A07(pair);
        Number number = (Number) pair.first;
        Number number2 = (Number) pair.second;
        C04220Ms.A04(number);
        int intValue = number.intValue();
        if (intValue >= r5.A00) {
            C04220Ms.A04(number2);
            if (number2.intValue() <= r5.A01) {
                return;
            }
        }
        int i2 = intValue;
        C04220Ms.A04(number2);
        int intValue2 = number2.intValue();
        if (intValue <= intValue2) {
            while (true) {
                if (i2 < r5.A00 || i2 > r5.A01) {
                    SuggestBusinessFragment suggestBusinessFragment = r5.A05;
                    if (!(i2 < 0 || suggestBusinessFragment.A01 == null || (r0 = (AnonymousClass38I) suggestBusinessFragment.A00.getItem(i2)) == null || (user = r0.A01) == null)) {
                        HashMap A0y = AnonymousClass0wJ.A0y();
                        A0y.put("target_id", user.getId());
                        A0y.put("index", String.valueOf(i2 - 1));
                        suggestBusinessFragment.A01.BeG(new C37408JrQ("pro_account_suggestions", suggestBusinessFragment.A05, "suggested_pro_account", (String) null, (String) null, (Map) null, A0y, (Map) null));
                    }
                }
                if (i2 == intValue2) {
                    break;
                }
                i2++;
            }
        }
        r5.A00 = intValue;
        r5.A01 = intValue2;
    }
}
