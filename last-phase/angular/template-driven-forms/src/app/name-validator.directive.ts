import { Directive } from '@angular/core';
import {AbstractControl, NG_VALIDATORS, ValidationErrors, Validator, Validators} from "@angular/forms";
import {error} from "@angular/compiler-cli/src/transformers/util";

@Directive({
  selector: '[appNameValidator]',
  providers: [{provide: NG_VALIDATORS, useExisting: NameValidatorDirective, multi: true}],
  standalone: true
})
export class NameValidatorDirective implements Validator{

  constructor() { }

  validate(control: AbstractControl): ValidationErrors | null {
    if (!control.value) return null;
    const name = control.value.trim();
    const errors : ValidationErrors = {};
    if (!name.length){
      errors['required'] = true;
    }
    if (!/^[A-Za-z0-9 ]+$/.test(name)){
      errors['pattern'] = true;
    }
    if (name.length < 3){
      errors['length'] = true;
    }
    return errors;
  }
  registerOnValidatorChange(fn: () => void): void {

  }


}
