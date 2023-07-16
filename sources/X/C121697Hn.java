package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.graphservice.interfaces.Tree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Hn  reason: invalid class name and case insensitive filesystem */
public final class C121697Hn {
    public static Parcelable A00(Object obj) {
        if (obj instanceof Tree) {
            Tree tree = (Tree) obj;
            if (tree.isValidGraphServicesJNIModel()) {
                String A0q = C18220wO.A0q(tree);
                TreeParcelable treeParcelable = new TreeParcelable(TreeParcelable.A01(tree), tree.getTypeTag(), A0q);
                treeParcelable.A00 = tree;
                return treeParcelable;
            }
            throw C18210wN.A0W("asTree_DO_NOT_USE");
        }
        AnonymousClass0LU.A0D("ModelParcelHelper", "Non-Tree type model conversion to Parcelable");
        return new ModelParcelHelper$LazyHolder(obj);
    }

    public static Object A01(Parcelable parcelable) {
        if (parcelable instanceof TreeParcelable) {
            try {
                return ((TreeParcelable) parcelable).A02();
            } catch (Exception e) {
                throw C18190wL.A0a(C18230wP.A0t("Exception deserializing GraphQL model from Parcel: ", e));
            }
        } else if (parcelable instanceof ModelParcelHelper$LazyHolder) {
            AnonymousClass0LU.A0D("ModelParcelHelper", "Parcelable deprecated flatbuffer model");
            Class<Object> cls = Object.class;
            Parcelable parcelable2 = ((ModelParcelHelper$LazyHolder) parcelable).A00;
            if (parcelable2 != null) {
                Class<?> cls2 = parcelable2.getClass();
                if (!cls.isAssignableFrom(cls2)) {
                    throw C18190wL.A0a(AnonymousClass00U.A0d("Type mismatch. Expected ", cls.getName(), ", got ", cls2.getName()));
                }
            }
            return parcelable2;
        } else {
            throw C18180wK.A0a("Unknown GraphQL model type in Parcel");
        }
    }

    public static List A02(Bundle bundle) {
        ArrayList parcelableArrayList;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("financial_entities")) == null) {
            return null;
        }
        ArrayList A0k = C18240wQ.A0k(parcelableArrayList.size());
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            if (parcelable != null) {
                A0k.add(A01(parcelable));
            } else {
                A0k.add((Object) null);
            }
        }
        return A0k;
    }

    public static void A03(Bundle bundle, List list) {
        ArrayList A0t = C18200wM.A0t(list);
        for (Object next : list) {
            if (next != null) {
                A0t.add(A00(next));
            } else {
                A0t.add((Object) null);
            }
        }
        bundle.putParcelableArrayList("financial_entities", A0t);
    }
}
