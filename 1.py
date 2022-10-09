
from os import walk

# folder path
dir_path = r'F:\JOC'

# list to store files name
res = []
for (dir_path, dir_names, file_names) in walk(dir_path):
    #res.extend(file_names)
    for filename in file_names: 
        if filename.endswith(".py"):
            res.append(filename)