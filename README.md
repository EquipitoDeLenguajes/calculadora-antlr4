# calculadora-antlr4

## Instructions for use.

The following instructions should be followed if you have a linux distribution with a bash terminal.

You need to install antlr. Use this [website](https://www.cs.upc.edu/~cl/practica/install.html) instructions.

To install pip:

```sh
sudo apt install python-pip
```

To activate the virtual environment

```sh
source .venv/bin/activate
```

**Note**: If you don´t have virtual environment:

```sh
pip install virtualenv
```

### Step 1: Install the program's libraries and dependencies:

```sh
pip install -r requirements.txt
```

### Step 2: Compile the .g4 grammar in the Python language:

```sh
antlr4 -visitor -Dlanguage=Python3 LabeledExpr.g4
```

### Step 3: Run the file with a test:

```sh
python3 calc.py t.expr
```

### Step 4: Use your own expression:

```sh
python3 calc.py
```

And write the expression later.

## Team:

- **Mateo Fonseca**
- **Santiago Garzón**
- **Karol Guerrero**
- **Sebastian Barros**
