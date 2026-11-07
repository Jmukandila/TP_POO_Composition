# TP POO — Composition vs Héritage (Chapitre 3)

##  Présentation
Ce projet illustre le refactoring d'une architecture orientée objet basée sur un héritage abusif vers une architecture souple utilisant la composition, les  interfaces et la délégation.

---

##  Comparatif Architecture : Avant vs Après

### Architecture initiale (Héritage abusif)
```text
Car extends Engine
Vehicle ── PetrolVehicle ── ManualPetrolVehicle / AutomaticPetrolVehicle ... (Explosion combinatoire)