// Generated by data binding compiler. Do not edit!
package codechallenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import codechallenge.R;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.visualdx.codechallenge.repository.CurrencyViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout currencyLayout;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final MaterialAutoCompleteTextView tvAutoComplete;

  @NonNull
  public final TextView txtCode;

  @NonNull
  public final TextView txtCodeValue;

  @NonNull
  public final TextView txtError;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtNameValue;

  @Bindable
  protected CurrencyViewModel mViewModel;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout currencyLayout, TextInputLayout textInputLayout,
      MaterialAutoCompleteTextView tvAutoComplete, TextView txtCode, TextView txtCodeValue,
      TextView txtError, TextView txtName, TextView txtNameValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.currencyLayout = currencyLayout;
    this.textInputLayout = textInputLayout;
    this.tvAutoComplete = tvAutoComplete;
    this.txtCode = txtCode;
    this.txtCodeValue = txtCodeValue;
    this.txtError = txtError;
    this.txtName = txtName;
    this.txtNameValue = txtNameValue;
  }

  public abstract void setViewModel(@Nullable CurrencyViewModel viewModel);

  @Nullable
  public CurrencyViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}