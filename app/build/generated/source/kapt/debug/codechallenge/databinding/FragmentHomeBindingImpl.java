package codechallenge.databinding;
import codechallenge.R;
import codechallenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout, 5);
        sViewsWithIds.put(R.id.currencyLayout, 6);
        sViewsWithIds.put(R.id.txtCode, 7);
        sViewsWithIds.put(R.id.txtName, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvAutoCompleteandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.searchCurrency.getValue()
            //         is viewModel.searchCurrency.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvAutoComplete);
            // localize variables for thread safety
            // viewModel.searchCurrency.getValue()
            java.lang.String viewModelSearchCurrencyGetValue = null;
            // viewModel.searchCurrency
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> viewModelSearchCurrency = null;
            // viewModel.searchCurrency != null
            boolean viewModelSearchCurrencyJavaLangObjectNull = false;
            // viewModel
            com.visualdx.codechallenge.repository.CurrencyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSearchCurrency = viewModel.getSearchCurrency();

                viewModelSearchCurrencyJavaLangObjectNull = (viewModelSearchCurrency) != (null);
                if (viewModelSearchCurrencyJavaLangObjectNull) {




                    viewModelSearchCurrency.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.LinearLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAutoComplete.setTag(null);
        this.txtCodeValue.setTag(null);
        this.txtError.setTag(null);
        this.txtNameValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.visualdx.codechallenge.repository.CurrencyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.visualdx.codechallenge.repository.CurrencyViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCurrencyList((kotlinx.coroutines.flow.StateFlow<java.util.List<com.visualdx.codechallenge.network.Currency>>) object, fieldId);
            case 1 :
                return onChangeViewModelCode((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelShowError((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelSearchCurrency((kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelName((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCurrencyList(kotlinx.coroutines.flow.StateFlow<java.util.List<com.visualdx.codechallenge.network.Currency>> ViewModelCurrencyList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCode(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowError(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelShowError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchCurrency(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> ViewModelSearchCurrency, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        kotlinx.coroutines.flow.StateFlow<java.util.List<com.visualdx.codechallenge.network.Currency>> viewModelCurrencyList = null;
        java.lang.String viewModelCodeGetValue = null;
        java.lang.Boolean viewModelShowErrorGetValue = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelCode = null;
        java.util.List<com.visualdx.codechallenge.network.Currency> viewModelCurrencyListGetValue = null;
        java.lang.String viewModelSearchCurrencyGetValue = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelShowError = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowErrorGetValue = false;
        java.lang.String viewModelNameGetValue = null;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> viewModelSearchCurrency = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelName = null;
        int viewModelShowErrorViewVISIBLEViewGONE = 0;
        com.visualdx.codechallenge.repository.CurrencyViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.currencyList
                        viewModelCurrencyList = viewModel.getCurrencyList();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelCurrencyList);


                    if (viewModelCurrencyList != null) {
                        // read viewModel.currencyList.getValue()
                        viewModelCurrencyListGetValue = viewModelCurrencyList.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._code
                        viewModelCode = viewModel.get_code();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelCode);


                    if (viewModelCode != null) {
                        // read viewModel._code.getValue()
                        viewModelCodeGetValue = viewModelCode.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._showError
                        viewModelShowError = viewModel.get_showError();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 2, viewModelShowError);


                    if (viewModelShowError != null) {
                        // read viewModel._showError.getValue()
                        viewModelShowErrorGetValue = viewModelShowError.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._showError.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowErrorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowErrorGetValue);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowErrorGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._showError.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowErrorViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowErrorGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchCurrency
                        viewModelSearchCurrency = viewModel.getSearchCurrency();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 3, viewModelSearchCurrency);


                    if (viewModelSearchCurrency != null) {
                        // read viewModel.searchCurrency.getValue()
                        viewModelSearchCurrencyGetValue = viewModelSearchCurrency.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._name
                        viewModelName = viewModel.get_name();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 4, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel._name.getValue()
                        viewModelNameGetValue = viewModelName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.visualdx.codechallenge.ui.BindingAdaptersKt.bindAdapter(this.tvAutoComplete, viewModelCurrencyListGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAutoComplete, viewModelSearchCurrencyGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvAutoComplete, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvAutoCompleteandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeValue, viewModelCodeGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.txtError.setVisibility(viewModelShowErrorViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameValue, viewModelNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.currencyList
        flag 1 (0x2L): viewModel._code
        flag 2 (0x3L): viewModel._showError
        flag 3 (0x4L): viewModel.searchCurrency
        flag 4 (0x5L): viewModel._name
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._showError.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._showError.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}