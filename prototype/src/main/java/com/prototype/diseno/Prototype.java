package com.prototype.diseno;



public interface Prototype <T extends Prototype> extends Cloneable{                                                     //<T extends Prototype> : se puede clonar cualquier obj q exrienda de la interfaz Prototype.

    T clone();                                                                                                          //clonacion simple
    T deepClone();                                                                                                      //clonacion profunda

}
