classList = []
classesNotTaken = []
coreList = []
majorList = []
name = ""
major = ""


def createProfile():
    global name, major
    print("What is your name?")
    name = input()
    print("What is your major?")
    major = input()
    

def initClassList():
    print("Please answer the following questions in YES/NO.")
    f = open("courseList.txt", "r")
    while True:
        readStr = f.readline()
        readStr = readStr.strip()
        if readStr == "":
            break
        classList.append(readStr)
    f.close
    for str in classList:
        buf = str.split(",")
        print("Have you taken", buf[1], "?")
        if input() == "NO":
            classesNotTaken.append(buf[1])

def checkClass(notTaken, curr):
    for str in notTaken:
        if str in curr:
            return True
    return False

def getMajorClasses():
    f = open("courseList.txt", "r")
    while True: 
        readStr = f.readline()
        readStr = readStr.strip()
        if "MAJORCLASS" in readStr:
            if checkClass(classesNotTaken, readStr) == True:
                split = readStr.split(",")
                buf = split[1] + "(" + split[3] + ")"
                majorList.append(buf)
        if readStr == "":
            break
    f.close
    return majorList

def getCoreClasses():
    f = open("courseList.txt", "r")
    while True: 
        readStr = f.readline()
        readStr = readStr.strip()
        if "CORECLASS" in readStr:
            if checkClass(classesNotTaken, readStr) == True:
                split = readStr.split(",")
                buf = split[1] + "(" + split[3] + ")"
                coreList.append(buf)
        if readStr == "":
            break
    f.close
    return coreList

def printIntoFile():
    global name, major
    f = open(name + "Schedule.csv", "w")
    buf = name + "," + major + "\n"
    f.write(buf)
    f.write(" ,Fall,,Spring,,Fall,,Spring,,Fall,,Spring,,Fall,,Spring\n")
    buf = "Core Classes"
    for str in coreList:
        buf += "," + str
    f.write(buf)
    f.write("\n")
    buf = "Major Classes"
    for str in majorList:
        buf += str + ","
    f.write(buf)
    f.close()

createProfile()
initClassList()
getMajorClasses()
getCoreClasses()
printIntoFile()

print("Classes not taken: ", classesNotTaken)
print("Major classes needed: ", majorList)
print("Core classes needed: ", coreList)
